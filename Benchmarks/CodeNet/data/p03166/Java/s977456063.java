import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int m = Integer.parseInt(s[1]);
    HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
    for(int i=0;i<m;i++){
      String[] str = br.readLine().split(" ");
      int u = Integer.parseInt(str[0]);
      int v = Integer.parseInt(str[1]);
      if(hm.containsKey(u)){
        ArrayList<Integer> al = hm.get(u);
        al.add(v);
        hm.put(u,al);
      }
      else{
        ArrayList<Integer> al = new ArrayList<>();
        al.add(v);
        hm.put(u,al);
      }
    }
    long ans = 0;
    long[] dp = new long[1000005];
    Arrays.fill(dp,-1);
    for(int i=1;i<=n;i++){
      ans = Math.max(ans,getBestLength(i,dp,hm));
    }
    System.out.println(ans);
  }
  
  public int getBestLength(int u,long[] dp,Map<Integer,ArrayList<Integer>> hm){
    if(dp[u]!=-1) return dp[u];
    else if(!hm.containsKey(u)){
      dp[u] = 0;
      return dp[u];
    }
      else{
        long bestLen = 0;
        for(int child : hm.get(u)){
          long currLen = getBestLength(child,dp,hm);
          bestLen = Math.max(bestLen,currLen);
        }
        dp[u] = bestLen+1;
        return dp[u];
      }
      
  }
}
      
