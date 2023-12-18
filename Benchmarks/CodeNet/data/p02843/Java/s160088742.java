import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String str = br.readLine();
        int total = Integer.parseInt(str);
        int result = 0;
        
        List<Integer> money_list = new ArrayList<>(Arrays.asList(100, 101, 102, 103, 104, 105));
        
        // for algorithm
        boolean[][] dp = new boolean[money_list.size()+1][total+1];
        
        for(int i = 0; i < money_list.size()+1; i++){
          Arrays.fill(dp[i], false);        
        }

        dp[0][0] = true;

        //algorithm
        for(int i = 0; i < money_list.size(); i++){
          for(int j = 0; j <= total; j++){
            if(dp[i][j]){
              dp[i+1][j] = true;
            }
            
            if(j >= money_list.get(i)){
              for(int k = 0; k <= i; k++){
                if(dp[i][j-money_list.get(k)]){
                  dp[i+1][j] = true;
                }
              }
            }

          }
        }

        for(int i = 1; i < money_list.size()+1; i++){
          if(dp[i][total]){
            result = 1;
          }
        }

        System.out.println(result);

      }
    }
}