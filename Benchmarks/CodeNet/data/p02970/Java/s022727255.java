import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        double ans = N / (2 * D + 1);
        System.out.println(Math.ceil(ans));
    }
}