import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = N;
        int c = 0;
        for (int i = N; i > 0; i--) {
            int ic = cnt(i);
            if (ic > c) {
                c = ic;
                n = i;
            }
        }
        System.out.println(n);
    }

    static int cnt(int n) {
        int c = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                break;
            }
            n /= 2;
            c++;
        }
        return c;
    }
}