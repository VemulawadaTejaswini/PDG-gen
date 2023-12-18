import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int total = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            total += Math.min(x, k - x) * 2;
        }

        System.out.println(total);
    }
}
