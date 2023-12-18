import java.util.*;
import java.math.*;
public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] ary = new int[a];
        int[] bry = new int[b];
        int[] cry = new int[c];
        for(int i = 0;i < a;i++){
            ary[i] = sc.nextInt();
        }
        for(int i = 0;i < b;i++){
            bry[i] = sc.nextInt();
        }
        for(int i = 0;i < c;i++){
            cry[i] = sc.nextInt();
        }
        Arrays.sort(ary);
        Arrays.sort(bry);
        Arrays.sort(cry);
        long ans = 0;
        for(int i = 0;i < x;i++){
            ans += ary[a-i-1];
        }
        for(int i = 0;i < y;i++){
            ans += bry[b-i-1];
        }
        a = a-x;
        b = b-y;
        c--;
        while(a>=0&&b>=0&&c>=0){
            if(ary[a]>bry[b]){
                if(bry[b]>cry[c]){
                    break;
                }else{
                    ans-=bry[b];
                    ans+=cry[c];
                    b--;
                    c--;
                }
            }else{
                if(ary[a]>cry[c]){
                    break;
                }else{
                    ans-=ary[a];
                    ans+=cry[c];
                    a--;
                    c--;
                }
            }
        }
        System.out.println(ans);
    }       
}




