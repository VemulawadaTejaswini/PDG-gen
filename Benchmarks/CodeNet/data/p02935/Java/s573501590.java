import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = input.nextInt();
        Arrays.sort(v);
        double u = v[0];
        for (int i = 1; i < n; i++) {
            u = (u + v[i]) / 2;
        }
        System.out.println(BigDecimal.valueOf(u).toPlainString());
    }
}
