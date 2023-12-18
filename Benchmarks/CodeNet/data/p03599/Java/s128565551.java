import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int answater = 0;
        int anssuger = 0;
        double ansper = 0;
        for (int i = 0; 100 * a * i <= f; i++) {
            for (int j = 0; 100 * a * i + 100 * b * j <= f; j++) {
                for (int k = 0; 100 * a * i + 100 * b * j + k * c <= f; k++) {
                    for (int l = 0; 100 * a * i + 100 * b * j + k * c + l * d <= f; l++) {
                        if (c * k + d * l > (a * i + b * j) * e) {
                            continue;
                        }
                        double tmp = (k * c + l * d) * 1.0 / (100 * a * i + 100 * b * j + k * c + l * d);

                        if (tmp > ansper) {
                            ansper = tmp;
                            answater = 100 * a * i + 100 * b * j + k * c + l * d;
                            anssuger = k * c + l * d;
                        }
                    }
                }
            }
        }
        System.out.println(answater + " " + anssuger);
    }
}