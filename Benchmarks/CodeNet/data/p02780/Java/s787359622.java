import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        int[] sum = new int[n + 1];
        for (int i = 0 ; i < n ; i++) {
            p[i] = sc.nextInt();
            sum[i + 1] = sum[i] + p[i];
        }
        int max = 0;
        for (int i = 0 ; i < n - k + 1 ; i++) {
            max = Math.max(max, sum[i + k] - sum[i]);
        }
        System.out.println((double) (max + k) / 2);
    }
}