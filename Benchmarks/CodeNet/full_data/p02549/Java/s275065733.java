import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    final static long MOD = 998244353;
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        var l = new int[k];
        var r = new int[k];
        int m = 0;
        for(int i = 0; i < k; i++){
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
            m += r[i] - l[i] +1;
        }
        var a = new int[m];
        int o = 0;
        for(int i = 0; i < k; i++){
            for(int j = l[i]; j <= r[i]; j++){
                a[o] = j;
                o++;
            }
        }
        Arrays.sort(a);
        
        var ans = new long[n+1];
        ans[1] = 1;
        int p = m;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < p; j++){
                int x = i + a[j];
                if(x <= n){
                    ans[x] += ans[i];
                    if(ans[x] > MOD){
                        ans[x] -= MOD;
                    }
                }else{
                    p = j-1;
                    break;
                }
            }
        }
        System.out.println(ans[n]);
    }
}