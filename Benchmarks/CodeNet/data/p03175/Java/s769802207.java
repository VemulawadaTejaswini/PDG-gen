import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>(n+1);
        for(int i=0;i<=n;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            arr.add(temp);
        }
        for(int i=1;i<=n-1;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            arr.get(x).add(y);
            arr.get(y).add(x);
        }
        long dp[][]=new long[n+1][2];
        int mod=1000000007;
        f(1,0,arr,-1,dp,mod);
        System.out.println(dp[1][0]);

    }
    public static long f(int root,int constraint,ArrayList<ArrayList<Integer>> arr,int parent,long dp[][],int mod){
        if(dp[root][constraint]!=0) return dp[root][constraint];
        ArrayList<Integer> temp=arr.get(root);
        long ans=0;
        long w1=1;
        for(int i=0;i<temp.size();i++){
            int child=temp.get(i);
            if(child!=parent){
                w1=(w1*f(child,0,arr,root,dp,mod)) % mod;
            }
        }
        ans=ans+w1;
        if(constraint==0){
            long w2=1;
             for(int i=0;i<temp.size();i++){
                int child=temp.get(i);
                if(child!=parent){
                    w2=(w2*f(child,1,arr,root,dp,mod)) % mod;
                }
             }
             ans=ans+w2;
            return dp[root][constraint]=ans;
        }
            return dp[root][constraint]=ans;
    }
}