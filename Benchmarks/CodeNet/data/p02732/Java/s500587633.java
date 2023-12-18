import java.util.*;
import java.io.*;
public class Main{
/// functions
static long gcd(long a,long b){if(b==0){return a;}return gcd(b,a%b);}
static long Modpow(long a,long p,long m){long res=1;while(p>0){if((p&1)!=0){res=(res*a)%m;}p >>=1;a=(a*a)%m;}return res;}
static long Modmul(long a,long b,long m){return ((a%m)*(b%m))%m;}
static long ModInv(long a,long m){return Modpow(a,m-2,m);}
static long nck(int n,int r,long m){if(r>n){return 0l;}return Modmul(f[n],ModInv(Modmul(f[n-r],f[r],m),m),m);}
// end
static long[] f;
// taking inputs
static BufferedReader s;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}
// ends
//......................................@uthor_Alx..............................................
static long cc(int n){
	return (long)(n*(n-1))/2;
}
public static void main(String[] args) throws  IOException{
       assign();
       int n=int_v(read());
       int[] arr=int_arr();
       Map<Integer,Integer> map=new HashMap<>();
       for(int x:arr){map.put(x,map.getOrDefault(x,0)+1);}
       	long res=0;
       for(int x:map.keySet()){
       	res+=cc(map.get(x));
       }
       for(int z:arr){
       	long res1=res-cc(map.get(z))+cc(map.get(z)-1);
       	out.write(res1+"\n");
       }
       
             
        out.flush();
  }
}
