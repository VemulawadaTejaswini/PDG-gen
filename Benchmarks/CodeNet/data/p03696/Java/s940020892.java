
import java.math.BigInteger;
import java.util.*;
public class B {



public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String s=sc.next();
  int ob=0;
  int cb=0;
  boolean check=false;
  Deque<Character> dq=new LinkedList<>();
  for(int i=0;i<n;i++) {
    dq.addLast(s.charAt(i));
  }
  
  Stack<Character> st=new Stack<>();
  for(int i=0;i<n;i++) {
   if(st.isEmpty()) {
     st.push(s.charAt(i));
     continue;
   }
   if(st.peek()=='('&&s.charAt(i)==')') {
     st.pop();
     continue;
   }
   st.push(s.charAt(i));
  
  }
   while(!st.isEmpty()) {
     if(st.peek()=='(') {
       dq.addLast(')');
       st.pop();
     }else {
       dq.addFirst('(');
       st.pop();
     }
   }
   for(char i:dq) {
     System.out.print(i);
   }
   System.out.println();


}
}
class Solution{

  public static int minSum(int arr[], int n, int k) 
  { 
          int dp[][][]=new int[n+1][k+1][100001];
          for(int i=0;i<=n;i++){
              for(int j=0;j<=k;j++){
                for(int kk=0;kk<100001;kk++)
                 dp[i][j][kk]=-1;
          }
          }
          int ans=solve(arr,n,n,k,dp,100000);
          return ans;
          
  } 
  static int solve(int arr[],int nn,int n,int k,int dp[][][],int prev){
     
 
    if(k==1){
          int ans=100001;

         for(int i=0;i<n;i++){
             ans=Math.min(ans,arr[i]);
         }
        
         return ans>prev?100001:ans;
  
      }
      if(n==0){
          return 100001;
      }
      if(dp[n][k][prev]!=-1) {
        return dp[n][k][prev];
      }
     int ans=100001;
     if(arr[n-1]<=prev){
     
     ans=Math.min(ans, Math.min(solve(arr,nn,n-1,k-1,dp,arr[n-1])+arr[n-1],solve(arr,nn,n-1,k,dp,prev)));

     }else{
     ans=Math.min(ans, solve(arr,nn,n-1,k,dp,prev));
     }
     
return dp[n][k][prev]=ans;
  }
  
 }






