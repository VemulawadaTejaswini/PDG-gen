import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String args[]){
        
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[k];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.fill(b, 0);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                int sum = 0;
                int cand = Integer.MAX_VALUE;
                int candn = 0;
                for (int l = 0; l <= j; l++) {
                    sum += a[l + i];
                    //System.out.println(sum);
                }
                for (int m = 0; m < k; m++) {
                    if (b[m] < cand) {
                        cand = b[m];
                        candn = m;
                    }
                }
                if (cand < sum) {
                    b[candn] = sum;
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            //System.out.println("b"+i+" = "+b[i]);
            min = Math.min(min, b[i]);
        }
        ans = min;
        //System.out.println("---");
        System.out.println(ans);
    }
}