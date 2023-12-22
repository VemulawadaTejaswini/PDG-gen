import java.util.*;
import java.io.*;

public class Main{

static BufferedReader s1;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split("\\s+");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split("\\s+");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}
static long Modpow(long a,long p,long m){long res=1;while(p>0){if((p&1)!=0){res=(res*a)%m;}p >>=1;a=(a*a)%m;}return res;}
static long Modmul(long a,long b,long m){return ((a%m)*(b%m))%m;}
static int gcd(int a,int b){if(b==0){return a;}return gcd(b,a%b);}
//......................................@uthor_Alx..............................................
static long mod=(long)1e9+7;
static void spf(int n, int[] spf){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
          if(spf[i]!=0) continue;
          spf[i]=i;
          for(int j=i*i;j<=n;j+=i){
            if(spf[j]!=0) continue;
            spf[j]=i;
          }
        }
        for(int i=1;i<=n;i++){
          if(spf[i]==0){spf[i]=i;}
        }
    }
public static void main(String[] args) throws  IOException{
                assign();
               int[] x=int_arr();
               int n=x[0];//,m=x[1];
               int[] a=int_arr();
               int[] spf=new int[1000001];
               spf[1]=1;
               spf(1000000,spf);
               int gg=a[0];
               boolean[] b=new boolean[1000001];
               boolean bb=true;
               for(int z:a){gg=gcd(gg,z);}
                for(int i=0;i<n;i++){
                    int ce=a[i],cf=spf[ce];
                    while(ce!=1){
                        if(cf==0) break;
                        while(ce%cf==0){
                            if(b[cf]) bb=false;
                            ce/=cf;
                        }
                        b[cf]=true;
                        cf=spf[ce];
                    }
                }
                if(bb){out.write("pairwise coprime");}
                else if(gg==1) out.write("setwise coprime");
                else out.write("not coprime");
                out.flush();

    }
}