import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
//给出两个数a,b 求出[a,b]中各位数字之和能整除原数的数的个数。
public class Main {

    int mod ;
    //
    //int[][] dp = new int[1001][1001];
    void solve(long n) {
        long[] fact = new long[17];
        long[] dp = new long[17];
        fact[1] = (long)26;
        fact[0] = (long)1;
        //dp[0] = 0;
        for(int i=1;i<=14;i++){
            fact[i]  = fact[i-1]*26;
            //dp[i] = dp[i-1]+fact[i];
            //System.out.println(i+" " +fact[i]);
        }
        n--;
        long k = n;
        int cnt = 1;
        while(k>=0){
            if(k>=fact[cnt]){
                k-=fact[cnt];
                cnt++;
            }else{
                break;
            }
        }
        //System.out.println(k+" "+cnt);
        helper(fact,cnt,k);

    }
    void helper(long[] fact, int len, long n){
        StringBuilder sb = new StringBuilder();
        for(int i=len;i>=1;i--){
            long idx = n/fact[i-1];
            //System.out.println(idx);
            n -= idx*fact[i-1];
            sb.append((char) ((int)idx+'a'));
        }
        System.out.println(sb);

    }


    public static void main(String[] args)  throws IOException {
        // Use the Scanner class

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]  s = br.readLine().split(" ");
        Main test = new Main();

        long n = Long.parseLong(s[0]);

        test.solve(n);
        //int tot = Integer.parseInt(br.readLine());


//        int i =1;
//        System.out.println();
//        while(tot>0){
//
//            String s = br.readLine();
//            String[] sr = s.split(" ");
//            List<Long> ls = new ArrayList<>();
//            for(String ss:sr){
//                ls.add(Long.parseLong(ss));
//            }
//            Main tt = new Main();
//            tt.sol(ls);
//            // String Buffer to store answer
//            StringBuffer sb = new StringBuffer();
////            Solution obj = new Solution();
////
////            System.out.println("Case #"+i+": "+obj.sol());
//            tot--;
//            i++;
//        }
    }

}
