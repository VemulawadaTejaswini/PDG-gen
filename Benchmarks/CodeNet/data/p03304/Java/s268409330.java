import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        double result = 0.0;
        if (d == 0) {
            result = (double) (m - 1) / n;
        } else {
            result = (double) ( 2 * (n - d) )/ n;
        }
        System.out.println(result);
    }
}
