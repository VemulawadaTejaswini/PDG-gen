import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        Arrays.sort(h);

        int diff = 10000000;
        for (int i = 0; i <= n%k; i++) {
            for (int j = i; j < n-(n%k)+i; j += k) {
                int max = h[j];
                int min = h[j];
                for (int z = j; z < j+k; z++) {
                    if (z > n-1) break;
                    max = Math.max(h[z], max);
                    min = Math.min(h[z], min);
                }
                diff = Math.min(diff, max-min);
            }
        }
        
        System.out.println(diff);
    }
}
