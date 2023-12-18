import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int k = Integer.parseInt(s[1]);
    int[] arr = new int[n];
    //int sum = 0;
    String[] str = br.readLine().split(" ");
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(str[i]);
      //sum += arr[i];
    }
    boolean[] dp = new boolean[k+1];
    for(int i=0;i<=k;i++){
      for(int j=0;j<n;j++){
        if(i-arr[j]<0)
          break;
        else if(dp[i-arr[j]]==true){
          dp[i] = true;
          break;
        }
      }
         if(dp[k]==true)
    System.out.println("First");
  else
    System.out.println("Second");
    }
    
 
  }
}
