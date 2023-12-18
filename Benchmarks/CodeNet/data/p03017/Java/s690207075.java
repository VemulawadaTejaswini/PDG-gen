import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    int N;
    int A;
    int B;
    int C;
    int D;
    byte[] S;

    private void run() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = scanner.nextInt() - 1;
        B = scanner.nextInt() - 1;
        C = scanner.nextInt() - 1;
        D = scanner.nextInt() - 1;
        S = scanner.next().getBytes();

        int time = 0;
        boolean ok = check(time, A, B, C, D);
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private boolean check(int time, int a, int b, int c, int d) {
        if (a >= N || b >= N || a > c || b > d){
            return false;
        }else if (a == c && b == d) {
            return true;
        } else if (S[a] == 35 || S[b] == 35 || a==b) {
            return false;
        }
        time++;
        return check(time, a + 1, b, c, d) ||
                check(time, a + 2, b, c, d) ||
                check(time, a, b + 1, c, d) ||
                check(time, a, b + 2, c, d);
    }
}