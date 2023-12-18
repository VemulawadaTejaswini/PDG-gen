import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(cal(n, k));
    }

    private static long cal(final int n, final int k) {
        long res = k;
        for (int i = 1; i < n; i++) {
            res *= k-1;
        }
        return res;
    }
}
