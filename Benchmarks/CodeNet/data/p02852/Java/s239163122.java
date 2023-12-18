import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    String S = sc.next();
    int dp[] = new int[N+1]; //マスiに到達するための最短手数
     dp[0]=0;
    int gr[] = new int[N+1];
    for(int i=0;i<N+1;i++){
      gr[i]=Integer.parseInt(S.substring(i,i+1));
    }
    int maxLen=0;
    int tmp=0;
    for(int i=0;i<N+1;i++){
      if(gr[i]==1){
        tmp++;
      }else if(tmp!=0){
        maxLen=Math.max(maxLen,tmp);
        tmp=0;
      }else{
        continue;
      }
    }
    if(maxLen>=M){
      System.out.println(-1);
    }

  }
  

  
}
