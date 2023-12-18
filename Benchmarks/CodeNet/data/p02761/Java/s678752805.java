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
        int ans = 0;
        boolean z = true;
        boolean o = true;
        boolean t = true;
        for(int i = 0;i < m;i++){
            if(a[i]==3&&z){
                z = false;
                ans += b[i];
            }
            if(a[i]==3&&!z){
                if(b[i]==(ans%10))continue;
                ans = -1;
                break;
            }
            if(a[i]==2&&o){
                if(b[i]==0&&n==2){
                    ans = -1;
                    break;
                }
                o = false;
                ans += b[i]*10;
            }
            if(a[i]==2&&!o){
                int tmp = ans%100;
                tmp /=10;
                if(b[i] == tmp)continue;
                ans = -1;
                break;
            }
            if(a[i]==1&&t){
                if(b[i]==0&&n==3){
                    ans = -1;
                    break;
                }
                t = false;
                ans += b[i]*100;
            }
            if(a[i]==1&&!t){
                if(b[i]==ans/100)continue;
                ans = -1;
                break;
            }
        }
        System.out.println(ans);
        
    }
}
