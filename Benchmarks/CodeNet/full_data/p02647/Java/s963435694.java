import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int hash = Arrays.hashCode(a);
        for (int i = 0; i < k; i++) {
            int[] sum = new int[n+1];
            for (int j = 0; j < n; j++) {
                int l = Math.max(0, j - a[j]);
                int r = Math.min(n, j + a[j] + 1);
                sum[l]++; sum[r]--;
            }
            a[0] = sum[0];
            for (int j = 0; j < n-1; j++) {
                a[j+1] = a[j] + sum[j+1];
            }
            int nhash = Arrays.hashCode(a);
            if(hash == nhash)break;
            hash = nhash;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i] + " ");
        }
        System.out.println(sb.toString().trim());
        sc.close();

    }

}
