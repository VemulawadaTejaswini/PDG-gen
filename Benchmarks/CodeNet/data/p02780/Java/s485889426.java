import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0;i<n; i++) {
            a[i] = sc.nextInt();
        }
        double max = 0;
        for (int i = 0;i<=n-k;i++) {
            double sum = 0;
            for (int j = i;j<k+i;j++) {
                sum += (double)(a[j] * (a[j] + 1)) / (2 * a[j]);
            }
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}