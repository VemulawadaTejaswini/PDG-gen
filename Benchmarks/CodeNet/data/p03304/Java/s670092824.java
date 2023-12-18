import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        double result =
                (d == 0) ? (double) (m - 1) / n : (double) 2 * (n - d) * (m - 1) / (n * n) ;

        System.out.println(result);
    }
}
