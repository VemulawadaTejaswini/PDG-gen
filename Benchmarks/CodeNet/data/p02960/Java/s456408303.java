import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    int sl=s.length();
    int dp[][] = new int[sl][13];
    int bt[] = new int[13];
    int modder = 1000000007;
    
    for(int i=0;i<13;i++){
      bt[i]=(i*10)%13;
    }
    for(int i=0;i<sl;i++){
      Arrays.fill(dp[i],0);
    }
    
    if(s.charAt(0)=='?'){
      for(int i=0;i<10;i++){
        dp[0][i]=1;
      }
    }else{
      dp[0][Integer.valueOf(s.charAt(0))-48]=1;
    }
    
    for(int i=1;i<sl;i++){
      for(int j=0;j<13;j++){
        if(s.charAt(i)=='?'){
          for(int k=0;k<10;k++){
            dp[i][(bt[j]+k)%13]=(dp[i][(bt[j]+k)%13]+dp[i-1][j])%modder;
          }
        }else{
          dp[i][(bt[j]+Integer.valueOf(s.charAt(i))-48)%13]=dp[i-1][j];
        }
      }
    }
    System.out.println(dp[sl-1][5]);
  }
}