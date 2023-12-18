import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int s1 = 0;
        int s2 = Arrays.stream(w).sum();
        int min = Integer.MAX_VALUE;
        min = Math.min(min, Math.abs(s1 - s2));
        for (int i = 0; i < n; i++) {
            s1 += w[i];
            s2 -= w[i];
            min = Math.min(min, Math.abs(s1 - s2));
        }
        System.out.println(min);
    }
}