import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), D = sc.nextInt(), X = sc.nextInt(), A;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            cnt += (D-1) / sc.nextInt() + 1;
        }
        System.out.println(cnt + X);
    }
}
