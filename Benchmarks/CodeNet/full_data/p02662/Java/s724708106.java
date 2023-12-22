import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
public class Main {
    int mod = 998244353;
    Integer[][] memo;
    public void sol(int[] arr,int n,int s) {
        memo = new Integer[n+1][s+1];
        System.out.println(dp(0,0,arr,s));
    }

    int dp(int i, int sum, int[] arr,int s){
        if(i==arr.length){
            return sum==s?1:0;
        }
        if(sum>s) return 0;
        if(memo[i][sum]!=null) return memo[i][sum];
        int res = 0;
        res = dp(i+1,sum,arr,s)*2;
        res%=mod;
        res+= dp(i+1,sum+arr[i],arr,s);
        res%=mod;
        return memo[i][sum] = res;
    }



    public static void main(String[] args)  throws IOException {
        // Use the Scanner class
        Main aka = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ss = br.readLine().split(" ");
        int N = Integer.parseInt(ss[0]);
        int S = Integer.parseInt(ss[1]);
        int[] arr = new int[N];
        ss = br.readLine().split(" ");
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(ss[i]);
        }
        //int tot = Integer.parseInt(br.readLine());

        aka.sol(arr,N,S);
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
