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
//......................................@uthor_Alx..............................................
static long mod=(long)1e9+7;
static long rec(long x, Map<Long,Long> map,long[][] op,long d){
    if(x<=0l){
        map.put(0l,0l); return 0l;
    }
    if(map.get(x)!=null) return map.get(x);
    long n=x;
    map.put(x,(long)4e18);
    if((map.get(x)+d-1)/d>n) map.put(x,d*n);
    for(int i=0;i<3;i++){
        if(x%op[i][0]==0){
            map.put(x,Math.min(map.get(x),rec(x/op[i][0],map,op,d)+op[i][1]));
        }
        else{
            map.put(x,Math.min(map.get(x),d*(x%op[i][0])+rec(x/op[i][0],map,op,d)+op[i][1]));
            map.put(x,Math.min(map.get(x),d*(op[i][0]-x%op[i][0])+rec(x/op[i][0]+1,map,op,d)+op[i][1]));
        }
    }
    
     return map.get(n);
}
public static void main(String[] args) throws  IOException{
                assign();
                int t=int_v(read());
               while(t--!=0){
                     long[] x=long_arr();
                     long n=x[0],a=x[1],b=x[2],c=x[3],d=x[4];
                     Map<Long,Long> map=new HashMap<>();
                     long[][] op=new long[][]{{2l,a},{3l,b},{5l,c}};
                     out.write(rec(n,map,op,d)+"\n");
               }

                out.flush();

    }
}
