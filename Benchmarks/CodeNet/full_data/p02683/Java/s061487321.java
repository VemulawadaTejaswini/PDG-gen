//package code;
import java.io.*;
import java.util.*;
import java.math.*;
public class Main 
{
    public static int t,Dx ,Dy ,J,ans,n,len=0,answer,q ,k,x ,m, a[],tin[],tout[],discover[],time, b[],count,degree[],parent[] ,parent_count[], size[] ,mat[][] , depth[],pre[],blockSize;
    static long  mod=(long)(1e9) + 7 , dp[],sum ,mod1=(long)(998244353);
    static int[] dx={-1, 1,0,0} , dy={0 ,0 , -1 ,1};
    static boolean visited[],isPandatic[];
    public static TreeSet<Integer> ts[];
    public static LinkedList<Integer> lst ,adj[];
    public static PrintWriter pw;
    public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static int max1=2000005;
    public static void main(String[] args){
        new Thread(null,null,"Prabhat Kumar Prajapati",1<<28)
        {
           public void run() 
           {
               try
               {
                   solve();
               }
               catch(Exception e)
               {   
                   e.printStackTrace();
                   System.exit(1);
               }
           }
        }.start();
    }
public static void solve()throws IOException
{
    pw = new PrintWriter(System.out);
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();
    x=sc.nextInt();
    mat=new int[n][m+1];
    ans=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        for(int j=0;j<m+1;j++)
            mat[i][j]=sc.nextInt();
    }
    a=new int[m+1];

    func(0 , a , 0);
    if(ans==Integer.MAX_VALUE)pw.println(-1);
    else 
    pw.println(ans);
    pw.close();
}
static void func(int indx , int[] a , int cost){
    if(valid(a)){
        ans=Math.min(ans , cost);
        return;
    }
    if(indx>=n)return;
    
    func(indx+1 , a , cost);

    for(int j=1;j<=m;j++){
        a[j]+=mat[indx][j];
    }
    func(indx+1 , a , cost+mat[indx][0]);

    for(int j=1;j<=m;j++){
        a[j]-=mat[indx][j];
    }
}
static boolean valid(int[] a){
    for(int i=1;i<=m;i++){
        if(a[i]<x)return false;
    }
    return true;
}
// here ans will store number of nodes on longest path
static int dfs(int cur){
    int d1=0;
    int d2=0;
    visited[cur]=true;
    for(int ver:adj[cur]){
        if(visited[ver])continue;
        int x=dfs(ver);
        if(x>d1){
            d2=d1;
            d1=x;
        }
        else if(x>d2){
            d2=x;
        }
        ans=Math.max(ans , d1+d2+1);
    }
    //pw.println((cur+1)  +" "+d1+" "+d2);
    return d1+1;
}
public static long pow(long n,long p,long m)
{
    long  result = 1;
      if(p==0)
        return 1;
    
    while(p!=0)
    {
        if(p%2==1)
            result *= n;
        if(result>=m)
        result%=m;
        p >>=1;
        n*=n;
        if(n>=m)
        n%=m;
    }
    return result;
}

}