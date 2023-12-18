import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
            sum += w[i];
        }

        int s1 = 0;
        int s2 = sum;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            s1 += w[i];
            s2 -= w[i];
            min = Math.min(min, Math.abs(s1 - s2));

        }
        System.out.println(min);
    }
}