import java.util.*;
import java.math.*;
class Main {
    //
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i = 0;i < m;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        char[] ans = new char[n];
        for(int i = 0;i < n;i++){
            ans[i] = '*';
        } 
        for(int i = 0;i < m;i++){
            if(ans[a[i]-1]=='*'){
                ans[a[i]-1] = (char)(b[i] + '0');
            }else{
                if(ans[a[i]-1]-'0'==b[i]){
                    continue;
                }else{
                    System.out.println("-1");
                    return;
                }
            }
        }
        for(int i = 0;i < n;i++){
            if(ans[i]=='*'){
                if(i==0){
                    ans[i]='1';
                }else{
                    ans[i]='0';
                }
            }
        }
        if(ans[0]=='0'){
            if(n == 1){
                System.out.println(0);
                return;
            }
            System.out.println(-1);
            return;
        }else{
            System.out.println(ans);
        }
    }
}
