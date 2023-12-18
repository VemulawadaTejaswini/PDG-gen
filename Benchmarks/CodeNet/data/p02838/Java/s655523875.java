import java.io.*;
import java.util.*;

public class Main{
    static public void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int n = sc.nextInt();
        long Mod = 1000000000+7;
        long[] a = new long[n];
        for(int i=0;i<n;i++) a[i] = sc.nextLong();
        long ans = 0L;
        for(int bit = 0; bit < 60; bit++){
            long mask = 1L << bit;
            long multi = mask%Mod;
            // one records how many numbers so far is '1' on this digit
            long zero = (mask&a[0])>0?0:1, one = (mask&a[0])>0?1:0;
            for(int i=1;i<n;i++){
                if((mask&a[i])>0){
                    // a[i] is 1 on this digit
                    ans += (multi)*zero;
                    one += 1;
                } else{
                    ans += (multi)*one;
                    zero += 1;
                }
                ans %= Mod;
            }
        }
        System.out.println(ans);
    }
}

