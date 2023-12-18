import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();

        int[] ans = solve(A, B, C, D, E, F);

        System.out.println(ans[0] + " " + ans[1]);
    }

    private static int[] solve(int A, int B, int C, int D, int E, int F) {
        int weightTotal = 0;
        int weightSugar = 0;
        double maxPercent = 0;

        for (int a=0; ; a++) {
            if (100*A*a > F) break;

            for (int b=0; ; b++) {
                int waterTotal = 100*A*a + 100*B*b;
                if (waterTotal > F) break;

                for (int c=0; ; c++) {
                    if (waterTotal + C*c > F) break;

                    for (int d=0; ; d++) {
                        int sugarTotal = C*c + D*d;

                        if (weightTotal < 0) System.exit(1);
                        if (waterTotal + sugarTotal > F) break;
                        if ((a*A + b*B) * E < sugarTotal) break;

                        if (calcPercent(waterTotal, sugarTotal) > maxPercent) {
                            maxPercent = calcPercent(waterTotal, sugarTotal);
                            weightTotal = waterTotal + sugarTotal;
                            weightSugar = sugarTotal;
                        }
                    }
                }
            }
        }

        return new int[]{weightTotal, weightSugar};
    }

    private static double calcPercent(int a, int b) {
        return 100.0 * b / (a+b);
    }
}
