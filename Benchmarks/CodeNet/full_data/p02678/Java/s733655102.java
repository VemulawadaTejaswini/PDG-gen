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

public static void main(String[] args) throws  IOException{
                assign();
                int[] x=int_arr();
                int n=x[0],m=x[1];
                List<Integer>[] g=new ArrayList[n+1];
                for(int i=0;i<=n;i++) g[i]=new ArrayList<>();
                for(int i=0;i<m;i++){
                    int[] e=int_arr();
                    g[e[0]].add(e[1]);
                    g[e[1]].add(e[0]);
                }
                int[] r=new int[n+1];
                Queue<Integer> q=new LinkedList<>();
                boolean[] b=new boolean[n+1];b[1]=true;
                q.add(1);
                while(!q.isEmpty()){
                    int p=q.poll();
                    for(int c:g[p]){
                        if(!b[c]){
                            r[c]=p;
                            q.add(c);
                            b[c]=true;
                        }
                    }
                }
                for(int i=2;i<=n;i++){
                    if(r[i]==0){
                        out.write("No");
                        out.flush();return;
                    }
                }
                out.write("Yes\n");
                for(int i=2;i<=n;i++){
                    out.write(r[i]+"\n");
                }
                out.flush();

    }
}
