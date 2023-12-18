import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        scan.close();
        int keta = N.length();
        double max = Double.parseDouble(N);
        double res = max;
        for (int i = 1; i < keta - 1; i++) {
            if (i % 2 == 0) {
                res = res - Math.pow(10, i);
            } else {
                res = res + Math.pow(10, i);
            }
        }

        System.out.println(res);
    }
}