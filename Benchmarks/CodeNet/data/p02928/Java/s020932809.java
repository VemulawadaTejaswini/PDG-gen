import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    long mod = 1000000000+7;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        long ans = 0;
        // first compute in-array situation
        long latterAdd = k*(k+1)/2, earlierAdd = k*(k-1)/2;
        for(int i=0;i<n;i++){
            // first consider the cases that originally index bigger
            for(int j=i+1;j<n;j++){
                if(a[j]<a[i]) ans = (ans+latterAdd)%mod;
            }
            // then consider the cases that originally smaller
            for(int j=i-1;j>=0;j--){
                if(a[j]<a[i]) ans = (ans + earlierAdd)&mod;
            }
        }
        return ans;
    }
}

