import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    // static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    static long[] fact = new long[100];
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] str = s.toCharArray();
        int[] ary = new int[s.length()];
        Arrays.fill(ary,INF);
        for(int i = 0;i < s.length();i++){
            int n = str[i]-'0';
            for(int j = i+1;j <= s.length();j++){
                n%=2019;
                if(n==0){
                    ary[i] = j-1;
                    break; 
                }
                if(j==s.length())break;
                n*=10;
                n+=str[j]-'0';
            }
        }
        long count = 0;
        for(int i = 0;i < s.length();i++){
            for(int j = i;j < s.length();){
                if(ary[j]==INF)break;
                count++;
                j = ary[j]+1;
            }
        }
        System.out.println(count);
    }
    
}
