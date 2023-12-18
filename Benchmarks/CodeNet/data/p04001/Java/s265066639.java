import java.util.*;
import java.math.*;
public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        long ans = 0;
        for(int i = 0;i < (1<<s.length()-1);i++){
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            for(int j = 0;j < s.length()-1;j++){
                if((1&(i>>j))==1){
                    sb.append("+");
                }
                sb.append(s.charAt(j+1));
            }
            String[] ss=sb.toString().split("\\+");
            for(String a:ss){
                ans+=Long.parseLong(a);
            }
        }
        System.out.println(ans);
    }    
    
}





