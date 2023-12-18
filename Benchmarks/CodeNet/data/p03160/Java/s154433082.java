import java.util.*;
import java.io.*;
public class Main{
public static int getMin(int N,int[]height){
    int[]dp=new int[N+1];
    dp[2]=Math.abs(height[0]-height[1]);
    for(int i=3;i<=N;i++){
      dp[i]=Math.min(dp[i-2]+Math.abs(height[i-3]-height[i-1]),dp[i-1]+Math.abs(height[i-2]-height[i-1]));
    }
    return dp[N];
  }
public static void main(String[] args){
    int N;
    Scanner in=new Scanner(System.in);
    N=in.nextInt();
    int[] height=new int[N];
    for(int i=0;i<N;i++)height[i]=in.nextInt();
    System.out.println(getMin(N,height));
    }
}
  
  