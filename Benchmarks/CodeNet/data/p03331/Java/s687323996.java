import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 999999999;
        for (int i = 1 ; i < N ; i ++) {
            int A = i;
            int a = 0;
            while (A > 0) {
                a += A  % 10;
                A /= 10;
            }
            int B = N - i;
            int b = 0;
            while (B > 0) {
                b += B % 10;
                B /= 10;
            }
            count = Math.min(count, a + b);

        }
        System.out.println(count);

    }

}
