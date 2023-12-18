import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC150C - Count Order

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] p = new int[n];
        int[] q = new int[n];
        
        int a = 1;
        int b = 1;

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            int cnt = 1, x = 1;
            for (int j = 0; j < i; j++) {
                if (p[i] > p[j]) {
                    ++cnt;
                }
            }
            for (int k = n - 1 - i; k > 0; k--) {
                x *= k;
            }
            a += x * (p[i] - cnt);
//            System.out.println("x=" + x + ", cnt=" + cnt + ", a=" + a);
        }
        
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
            int cnt = 1, x = 1;
            for (int j = 0; j < i; j++) {
                if (q[i] > q[j]) {
                    ++cnt;
                }
            }
            for (int k = n - 1 - i; k > 0; k--) {
                x *= k;
            }
            b += x * (q[i] - cnt);
//            System.out.println("x=" + x + ", cnt=" + cnt + ", b=" + b);
        }

        System.out.println(Math.abs(a - b));
    }
}