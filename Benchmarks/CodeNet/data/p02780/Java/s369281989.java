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
        long max = 0;
        for (int i = 0;i<=k-3;i++) {
            long exp = a[i] * (a[i] + 1) / (2 * a[i]);
            long exp1 = a[i+1] * (a[i+1] + 1) / (2 * a[i+1]);
            long exp2 = a[i+2] * (a[i+2] + 1) / (2 * a[i+2]);
            max = Math.max(exp+exp1+exp2, max);
        }
        System.out.println(max);
    }
}
