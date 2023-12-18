import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int y = X % 100;
        int max = X / 100 + 1;
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int sum = 0;
        int sum2 = 0;

        if (y == 0) {
            System.out.println(1);
            return;
        }
//        System.out.println("y = " + y);
        for (int i = y; i >= 0; i--) {
            sum = 0;
            sum2 = 0;
            sum = b * i;
            sum2 += i;
            for (int j = y - (b * i); j >= 0; j--) {
                sum += c * j;
                sum2 += j;
                for (int k = y - (b * i + c * j); k >= 0; k--) {
                    sum += d * k;
                    sum2 += k;
                    for (int l = y - (b * i + c * j + d * k); l >= 0; l--) {
                        sum += e * l;
                        sum2 += l;
                        for (int m = y - (b * i + c * j + d * k + e * l); m >= 0; m--) {
                            sum += f * m;
                            sum2 += m;
//                            System.out.println(sum);
//                            System.out.println(sum2);
//                            System.out.println(sum2 * 100 + y);
                            if (sum == y && sum2 * 100 + y <= X) {
                                System.out.println(1);
                                return;
                            }

                            sum -= f * m;
                            sum2 -= m;
                        }

                        sum -= e * l;
                        sum2 -= l;
                    }
                    sum -= d * k;
                    sum2 -= k;
                }
                sum -= c * j;
                sum2 -= j;
            }
            sum -= b * i;
            sum2 -= i;
        }

        System.out.println(0);


    }
}