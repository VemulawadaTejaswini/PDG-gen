import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        long sum = 0;
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextInt();
        }
        for (int i = 0; i < h.length; i++) {
            for (int j = h.length - 1; j > i; j--) {
                if (h[j] > h[j - 1]) {
                    int m = h[j];
                    h[j] = h[j - 1];
                    h[j - 1] = m;
                }
            }
        }
        for (int i = k; i < h.length; i++) {
            sum += h[i];
        }
        System.out.println(sum);
        sc.close();
    }
}