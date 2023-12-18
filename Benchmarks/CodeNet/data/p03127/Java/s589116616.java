import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int ans =solve(a,n);
        System.out.println(ans);

    }
    static int solve(int[] a, int n){
        Arrays.sort(a);
        if(n==1) return a[0];
        int ans = gcd(a[0],a[1]);
        for(int i=2;i<n;i++) ans = gcd(ans,a[i]);
        return ans;
    }
    static int gcd(int a, int b){
        if(a<b){
            int c = a;
            a = b;
            b = c;
        }
        while(a%b!=0){
            int c = a%b;
            a = b;
            b = c;
        }
        return b;
    }
}
