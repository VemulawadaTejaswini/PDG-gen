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
        for(int i = 0;i < s.length();i++){
            int n = str[i]-'0';
            for(int j = i+1;j <= s.length();j++){
                n%=2019;
                if(n==0){
                    ary[i] = j-1;
                    break; 
                }
                if(j==s.length())break;
                n=n*10+str[j]-'0';
            }
        }
        long count = 0;
        for(int i = 0;i < s.length();i++){
            long tmp = 0;
            for(int j = i;j < s.length();){
                int t = j;
                if(ary[j]==0)break;
                tmp=2*tmp+1;
                j = ary[j]+1;
                ary[t]=0;
            }
            count += tmp;
        }
        System.out.println(count);
    }
    
}
