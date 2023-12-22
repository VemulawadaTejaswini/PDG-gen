import java.util.*;
import java.io.*;
public class Main{
    static PrintWriter out;
    static Scanner sc;
    public static void main(String[] args){
        sc=new Scanner(System.in);
        out=new PrintWriter(System.out);

        int t=1;
      //  t=sc.nextInt();
        while(t-->0){
            forEachTestcase();
        }

        out.close();
    }

    static void forEachTestcase(){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            min=Math.min(min,a[i]);
            max=Math.max(max,a[i]);
        }
        int dp[]=new int[n];
        tree=new int[(max+2)*4];
        for(int i=n-1;i>=0;i--){
            dp[i]=1+query(0,0,max+1,Math.max(a[i]-k,min),Math.min(a[i]+k,max));
            update(0,0,max+1,a[i],dp[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,dp[i]);
        }
        out.println(ans);
    }

    static int tree[];
    static int query(int cur,int l,int r,int start,int end){
        if(l>end || r<start)return 0;
        if(l>=start && r<=end)return tree[cur];
        int mid=(l+r)>>1;
        return Math.max(query(2*cur+1,l,mid,start,end),query(2*cur+2,mid+1,r,start,end));
    }
    static void update(int cur,int l,int r,int ind,int val){
        if(l==r){
            tree[cur]=val;
            return;
        }
        int mid=(l+r)>>1;
        if(mid>=ind)update(2*cur+1,l,mid,ind,val);
        else update(2*cur+2,mid+1,r,ind,val);
        tree[cur]=Math.max(tree[2*cur+1],tree[2*cur+2]);
    }




    static class modOpeation{
        static long mod;
        modOpeation(long mod){
            this.mod=mod;
        }
        static long mul(long a,long b){
            a%=mod;
            b%=mod;
            return (a*b)%mod;
        }
        static long add(long a,long b){
            a%=mod;
            b%=mod;
            return (a+b)%mod;
        }
        static long sub(long a,long b){
            a%=mod;
            b%=mod;
            return ((a-b)%mod+mod)%mod;
        }
        static long modPow(long a,long b){
            long ans=1;
            while(b>0){
                if(b%2==1)ans=mul(ans,a);
                a=mul(a,a);
                b>>=1;
            }
            return ans;
        }
        static long modInv(long a){
            return modPow(a,mod-2);
        }
        static long ifact[],fact[];
        static long nCr(int n,int r){
            if(r>n)return 0;
            return mul(fact[n],mul(ifact[r],ifact[n-r]));
        }
        static void initFactorial(int max){
            fact=new long[max];
            ifact=new long[max];
            fact[0]=ifact[0]=1;
            for (int i = 1; i <max ; i++) {
                fact[i]=mul(fact[i-1],i);
                ifact[i]=mul(ifact[i-1],modInv(i));
            }
        }
    }

}