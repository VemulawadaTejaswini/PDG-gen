import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        int[] dp3 = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        dp1[0] = a[0];
        dp2[0] = b[0];
        dp3[0] = c[0];
        for(int i=1;i<n;i++){
            dp1[i] = Math.max(dp1[i], Math.max(dp2[i-1]+a[i], dp3[i-1]+a[i]));
            dp2[i] = Math.max(dp2[i], Math.max(dp1[i-1]+b[i], dp3[i-1]+b[i]));
            dp3[i] = Math.max(dp3[i], Math.max(dp2[i-1]+c[i], dp1[i-1]+c[i]));
        }
        System.out.println(Math.max(dp1[n-1], Math.max(dp2[n-1], dp3[n-1])));
    }
}