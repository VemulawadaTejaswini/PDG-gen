import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        int ansX = 0;
        int ansY = 0;
        int ansH = 0;
        boolean flag = true;
        for (int a = 0; a <= 100; a++) {
            for (int b = 0; b <= 100; b++) {
                flag = true;
                int c = Math.abs(a - x[0]) + Math.abs(b - y[0]) + h[0];
                for (int j = 1; j < n; j++) {
                    if (c != Math.abs(a - x[j]) + Math.abs(b - y[j]) + h[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ansH = c;
                    ansY = b;
                    break;
                }
            }
            if (flag) {
                ansX = a;
                break;
            }
        }
        System.out.println(ansX + " " + ansY + " " + ansH);
    }
}
