import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static long[][] selfCon, selfUncon;
    static long mod = 1000000000+7;
    static int n;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int[] left = new int[n], right = new int[n];

        left[0]=a[0];right[n-1]=a[n-1];
        for(int i=1;i<n;i++) left[i]=gcd(left[i-1],a[i]);
        for(int i=n-2;i>=0;i--) right[i] = gcd(right[i+1],a[i]);
        int ans = Math.max(right[1],left[n-2]);
        for(int i=1;i<n-1;i++){
            int cur = gcd(left[i-1],right[i+1]);
            ans = Math.max(cur,ans);
        }
        System.out.println(ans);
    }
    static int gcd(int a, int b){
        int c;
        if(a<b){
            c = a;
            a = b; b = c;
        }
        while(a%b!=0){
            c = a%b;
            a = b; b = c;
        }
        return b;
    }
}
