import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static int[] six = new int[]{46656,7776,1296,216,36,6};
    static int[] nine = new int[]{59049,6561,729,81,9};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n;
        for(int i=0;i<=n;i++) ans = Math.min(ans,help(n,i));
        System.out.println(ans);
    }
    static int help(int n, int m){
        int ans = 0;
        int t = n-m;
        for(int i=0;i<6;i++){
            if(m>=six[i]){
                ans += m/six[i];
                m = m%six[i];
            }
        }
        for(int i=0;i<5;i++) {
            if (t >= nine[i]) {
                ans += t / nine[i];
                t = t % nine[i];
            }
        }
        return ans+t+m;
    }
}
