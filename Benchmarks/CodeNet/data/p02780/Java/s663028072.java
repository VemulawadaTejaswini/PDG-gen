import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int k = sc.nextInt();   
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int[] s = cumulativeSum(p);
        int sum = 0;
        int max = sum;
        for (int i = 0; i < n-k+1; i++) {
            sum = s[i+k] - s[i];
            if (max < sum) {
                max = sum;
            }
        }
        double res = max / 2.0 + k / 2.0;
        System.out.println(res);
    }
    // 累積和
    public static int[] cumulativeSum(int[] a) {
        int[] s = new int[a.length + 1];
        for (int i = 0; i < s.length; i++) {
            s[i] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            s[i+1] = s[i] + a[i];
        }
        return s;
    }
}