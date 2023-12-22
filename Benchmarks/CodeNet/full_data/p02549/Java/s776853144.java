import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<k;i++){
      int a=s.nextInt();
      int b=s.nextInt();
      if(!arr.contains(a))
        arr.add(a);
      if(!arr.contains(b))
        arr.add(b);
      }
      int num=arr.size();
      int ans=getCount(arr,num,n);
      System.out.println(ans);
    }
    public static int getCount(ArrayList<Integer> arr,int num,int sum){
      int dp[][]=new int[sum+1][num+1];
      for(int i=0;i<=n;i++){
        dp[0][i]=1;
      }
      for(int i=1;i<=sum;i++){
        dp[i][0]=0;
      }
      for(int i=1;i<=sum;i++){
        for(int j=1;j<=n;j++){
          dp[i][j]=dp[i][j-1];
          if(arr.get(j-1)<=i)
            dp[i][j]+=dp[i-arr.get(j-1)][i];
        }
      }
      return dp[sum][n];
    }
}
