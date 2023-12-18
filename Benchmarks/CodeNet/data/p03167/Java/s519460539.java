import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
  int r=sc.nextInt();
  int c=sc.nextInt();
  char grid[][]=new char[r][c];
  char dp[][]=new char[r][c];
  for(int i=0;i<r;i++){
  for(int j=0;j<c;j++){
  grid[i][j]=sc.nextChar();
    if(grid[i][j]=='#')
      dp[i][j]=-1;
  }
  }
  dp[0][0]=1;
  
  for(int i=0;i<r;i++){
  for(int j=0;j<c;j++){
    if(i==0&&j==0)
      continue;
    if(dp[i][j]==-1)
      continue;
    
    if(j-1>=0&&dp[i][j-1]!=-1){
    dp[i][j]+=dp[i][j-1];
    }
    if(i-1>=0&&dp[i-1][j]!=-1){
    dp[i][j]+=dp[i-1][j];
    }
    
  }  
  }
  System.out.println(dp[r-1][c-1]);
}
}