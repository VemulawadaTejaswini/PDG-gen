import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) h[i] = input.nextInt();
        Arrays.sort(h);
        long r = 0;
        for (int i = 0; i < n - k; i++) r += h[i];
        System.out.println(r);
    }
}
