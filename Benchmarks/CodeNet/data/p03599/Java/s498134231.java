import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();
        double ans = 0;
        int tmp[] = new int[2];
        tmp[0] = 0;
        tmp[1] = 0;
        for (int a = 0; a * A * 100 <= F; a++) {
            for (int b = 0; a * A * 100 + b * B * 100 <= F; b++) {
                for (int c = 0; a * A * 100 + b * 100 * B + c * C <= F && c * C < =E * (a * A + b * B); c++) {
                    for (int d = 0; a * A * 100 + b * B * 100 + c * C + d * D <= F && c * C + d * D <= E * (a * A + b * B); d++) {
                        if (ans < (double)(c * C + d * D) / (double)(a * A * 100 + b * B * 100 + c * C + d * D)) {
                            ans =(double)(c * C + d * D) / (double)(((a + b) * 100) + c * C + d * D);
                            tmp[0] = a * A * 100 + b * B * 100 + c * C + d * D;
                            tmp[1] = c * C + d * D;
                        }
                    }
                }
            }
        }
        System.out.println(tmp[0] + " " + tmp[1]);
    }
}
