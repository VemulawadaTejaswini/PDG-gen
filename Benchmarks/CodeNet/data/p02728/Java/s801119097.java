import java.io.*; import java.util.*;
public class Main {
    static ArrayList<Integer> arl[];
    static long[] fac;
    static int[] siz;
    static long[] ans;
    static long[] dp;
    static long MOD=1000000007;
    public static void main(String[] args) throws IOException {
        fac=new long[200001];
        fac[0]=1;
        for (int i = 1; i < 200001; i++) {
            fac[i]=(fac[i-1]*i)%MOD;
        }
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        arl=new ArrayList[N];
        for (int i = 0; i < N; i++) {
            arl[i]=new ArrayList<>();
        }
        int a,b=0;
        for (int i = 0; i < N-1; i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken())-1;
            b=Integer.parseInt(st.nextToken())-1;
            arl[a].add(b); arl[b].add(a);
        }
        siz=new int[N];
        ans=new long[N];
        dp=new long[N];
        init(-1,0);
        ans[0]=dp[0];
        dfs(-1,0);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(ans[i]).append("\n");
        }
        System.out.println(sb.toString());
    }
    public static long inv(long a, long b){//Computes modular inverse of a mod b
        //Assume b>a and gcd(a,b)=1, 
        if(a==1)return 1;
        long q=b/a;
        long r=b-q*a;
        long y=-inv(r,a);
        return ((b*y+1)/a)+b;
        
    }
    public static void init(int p, int v){
        siz[v]=1;
        dp[v]=1;
        for (int u : arl[v]) {
            if(u==p)continue;
            init(v,u);
            siz[v]+=siz[u];
            dp[v]*=dp[u]; dp[v]%=MOD;
            dp[v]*=inv(fac[siz[u]],MOD); dp[v]%=MOD;
        }
        dp[v]*=fac[siz[v]-1]; dp[v]%=MOD;
        
    }
    public static void dfs(int p, int v){
        for (int u: arl[v]) {
            if(u==p)continue;
            dp[v]*=inv(dp[u],MOD); dp[v]%=MOD;
            dp[v]*=inv(fac[siz[v]-1],MOD); dp[v]%=MOD;
            dp[v]*=fac[siz[v]-siz[u]-1]; dp[v]%=MOD;
            dp[v]*=fac[siz[u]]; dp[v]%=MOD;
            siz[v]-=siz[u];
            siz[u]+=siz[v];
            dp[u]*=fac[siz[u]-1]; dp[u]%=MOD;
            dp[u]*=inv(fac[siz[u]-siz[v]-1],MOD); dp[u]%=MOD;
            dp[u]*=dp[v]; dp[u]%=MOD;
            dp[u]*=inv(fac[siz[v]],MOD); dp[u]%=MOD;
            ans[u]=dp[u];
            dfs(v,u);
            //Revert
            
            dp[u]*=inv(fac[siz[u]-1],MOD); dp[u]%=MOD;
            dp[u]*=fac[siz[u]-siz[v]-1]; dp[u]%=MOD;
            dp[u]*=inv(dp[v],MOD); dp[u]%=MOD;
            dp[u]*=fac[siz[v]]; dp[u]%=MOD;
            siz[u]-=siz[v];
            siz[v]+=siz[u];
            dp[v]*=dp[u]; dp[v]%=MOD;
            dp[v]*=fac[siz[v]-1]; dp[v]%=MOD;
            dp[v]*=inv(fac[siz[v]-siz[u]-1],MOD); dp[v]%=MOD;
            dp[v]*=inv(fac[siz[u]],MOD); dp[v]%=MOD;
            
        }
    }
}
