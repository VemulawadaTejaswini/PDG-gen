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
static int Modpow(int a,int p,int m){int res=1;while(p>0){if((p&1)!=0){res=(res*a)%m;}p >>=1;a=(a*a)%m;}return res;}
//......................................@uthor_Alx..............................................
static long mod=(long)1e9+7;

public static void main(String[] args) throws  IOException{
                assign();
                int[] x=int_arr();
                int h=x[0],w=x[1],m=x[2];
                Set<Integer>[] col=new HashSet[300001];
                for(int i=0;i<=300000;i++){col[i]=new HashSet<>();}
                int[] row=new int[300001]; int maxc=0,maxr=0;
                for(int i=0;i<m;i++){
                	int[] e=int_arr();
                	row[e[0]]++;
                	col[e[1]].add(e[0]);
                }
                for(int i=0;i<=300000;i++){
                    maxc=Math.max(maxc,col[i].size());
                    maxr=Math.max(maxr,row[i]);
                }
                List<Integer> r=new ArrayList<>();
                List<Integer> c=new ArrayList<>();
                for(int i=0;i<=300000;i++){
                    if(col[i].size()==maxc){c.add(i);}
                    if(maxr==row[i]){r.add(i);}
                }
                int res=maxr+maxc-1;
                for(int z:r){
                    for(int y:c){
                        if(!col[y].contains(z)){
                            res=maxr+maxc;
                        }
                    }
                }

              out.write(res+"");
                out.flush();

    }
}