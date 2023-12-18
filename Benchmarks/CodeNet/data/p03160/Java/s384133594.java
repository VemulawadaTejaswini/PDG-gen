import java.util.*;
import java.io.*;
 
public class Main{
public static void main(String[] args) throws IOException{
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	//int n = Integer.parseInt(br.readLine());
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  	int[] h = new int[n];
  	//String[] s = br.readLine().split(" ");
  	for(int i=0;i<n;i++) h[i] = sc.nextInt();
     // h[i] = Integer.parseInt(s[i]);
      int ans = solve(n,h);
      System.out.println(ans);
    }
  
  public static int solve(int n,int h[]){
    int[] dp = new int[n];
  	dp[1] = Math.abs(h[1]-h[0]);
  	for(int i=2;i<n;i++)
      dp[i] = Math.min(Math.abs(h[i]-h[i-1])+dp[i-1],Math.abs(h[i]-h[i-2])+dp[i-2]);
    return dp[n-1];
  }
}