import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = Integer.parseInt(sc.nextLine());
    
    int[] t = line2intAr(sc.nextLine(), n);
    int[] v = line2intAr(sc.nextLine(), n);
    
    int all = 0;
    for(int i=0; i<n; i++){
      all += t[i];
    }
    
    int[] vw = new int[all*2];
    int idx = 0;
    for(int i=0; i<n; i++){
      for(int j=0; j<t[i]*2; j++){
        vw[idx] = v[i]*2;
        idx++;
      }
    }
    
    final int VMAX = 101;
    
    int[][] dp = new int[all*2+1][VMAX*2];
    for(int i=0; i<dp.length; i++){
      for(int j=0; j<dp[i].length; j++){
        dp[i][j] = -(1<<30);
      }
    }
    dp[0][0] = 0;
    
    idx = 0;
    for(int k=0; k<n; k++){
      for(int i=0; i<t[k]*2; i++){
        for(int j=0; j<vw[idx]+1; j++){
          if(j+1 <= vw[idx] && dp[idx+1][j+1] < dp[idx][j]+j+1){
            dp[idx+1][j+1] = dp[idx][j]+ j+1;
          }
          if(j <= vw[idx] && dp[idx+1][j] < dp[idx][j]+j){
            dp[idx+1][j] = dp[idx][j]+ j;
          }
          if(j-1 <= vw[idx] && j-1 >= 0 && dp[idx+1][j-1] < dp[idx][j]+j-1){
            dp[idx+1][j-1] = dp[idx][j]+ j-1;
          }
        }
        idx++;
      }
    }
    
    System.out.println(dp[all*2][0]/4.0);
  }
  
  public static int[] line2intAr(String line, int n){
    String[] splited = line.split(" ");
    int[] ar = new int[n];
    for(int i=0; i<n; i++){
      ar[i] = Integer.parseInt(splited[i]);
    }
    return ar;
  }
}