import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 2017/09/29 7:16.
 */
public class Main {
    public static boolean isStrong(int a1, int b1, int a2, int b2) {
        int p1 = 100 * b1;
        int q1 = a1 + b1;
        int p2 = 100 * b2;
        int q2 = a2 + b2;

        if (q1 == 0) {
            return false;
        }
        if (q2 == 0) {
            return true;
        }

        return p1 * q2 > p2 * q1;
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt() * 100;
        int B = sc.nextInt() * 100;
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();

        int ansA = 0;
        int ansB = 0;

        for (int a = 0; a * A <= F; a++) {
            for (int b = 0; a * A + b * B <= F; b++) {
                int wa = a * A + b * B;
                int limit = Math.min(wa / 100 * E, F - wa);
                for (int c = 0; c * C <= limit; c++) {
                    for (int d = 0; c * C + d * D <= limit; d++) {
                        int wb = c * C + d * D;
                        if (isStrong(wa, wb, ansA, ansB)) {
                            ansA = wa;
                            ansB = wb;
                        }
                    }
                }
            }
        }
        System.out.println((ansA + ansB) + " " + ansB);
    }
}