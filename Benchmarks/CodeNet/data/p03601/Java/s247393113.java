import java.util.*;

public class Main
{

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();
        double density = 0.0;
        int sum_w = 0; int sum_s = 0;
        for (int a = 0; a < 35; a++) {
            for (int b = 0; b < 35; b++) {
                for (int c = 0; c < 35; c++) {
                    for (int d = 0; d < 35; d++) {
                        int t = 100*a*A + 100*b*B + c*C+d*D;
                        if (t == 0) continue;
                        if (c*C + d*D <= E*(a*A+b*B) && t <= F){
                            if (density < (c*C + d*D + 0.0) / t){
                                density = (c*C + d*D + 0.0) / t;
                                sum_w = 100*a*A + 100*b*B;
                                sum_s = c*C + d*D;
                            }

                        }
                    }
                }
            }
        }
        System.out.println((sum_w + sum_s) + " " + sum_s);
    }
}