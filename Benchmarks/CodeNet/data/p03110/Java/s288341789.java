import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        double rs = 0.0;

        for (int i=0;i<n;i++) {
            double d = sc.nextDouble();
            String s = sc.next();

            if (s.equals("JPY")) {
                rs += d;
            } else {
                rs += d * 380000.0;
            }
        }

        // 出力
        System.out.println(rs);
    }
}