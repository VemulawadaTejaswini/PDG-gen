/*import java.util.*;
import java.io.*;

 public class Main{
// taking inputs
static BufferedReader s1;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}
static long Modpow(long a,long p,long m){long res=1;while(p>0){if((p&1)!=0){res=(res*a)%m;}p >>=1;a=(a*a)%m;}return res;}
static long Modmul(long a,long b,long m){return ((a%m)*(b%m))%m;}
static long ModInv(long a,long m){return Modpow(a,m-2,m);}
static long nck(int n,int r,long m){if(r>n){return 0l;}return Modmul(f[n],ModInv(Modmul(f[n-r],f[r],m),m),m);}
static long[] f;
static long mod=(long)1e9+7;
//......................................@uthor_Alx..............................................
  static int f(char[][] c){
  	int res=0;
  	 for(int i=0;i<c.length;i++){
  	 	for(int j=0;j<c[0].length;j++){
  	 		if(c[i][j]=='#'){
  	 			res++;
  	 		}
  	 	}
  	 }
  	 return res;
  }
   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  	int[] x=int_arr();
	        		  	
	        		  	
	        		  	int res=0;
	        		  	int h=x[0],w=x[1],k=x[2];
	        		  	char[][] c=new char[h][w];
	        		  	for(int i=0;i<h;i++){
	        		  		c[i]=read().toCharArray();
	        		  	}
	        		  	for(int i=0;i<(1<<h);i++){
	        		  		for(int j=0;j<(1<<w);j++){
	        		  			char[][] c1=c.clone();
	        		  			for(int b=0;b<h;b++){
	        		  				if((i&1<<b)!=0){
	        		  					Arrays.fill(c1[b],'.');
	        		  				}
	        		  			}
	        		  			for(int b=0;b<w;b++){
	        		  				if((j&1<<b)!=0){
	        		  					for(int cc=0;cc<h;cc++){
	        		  						c1[cc][b]='.';
	        		  					}
	        		  				}
	        		  			}
	        		  			if(f(c1)==k){
	        		  				res++;
	        		  			}

	        		  		}
	        		  	}
	        		  	out.write(res+"");
                      	out.flush();
	        		 
	}
}
*/
import java.util.*;
import java.io.*;

 public class Main{
// taking inputs
static BufferedReader s1;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}
static long Modpow(long a,long p,long m){long res=1;while(p>0){if((p&1)!=0){res=(res*a)%m;}p >>=1;a=(a*a)%m;}return res;}
static long Modmul(long a,long b,long m){return ((a%m)*(b%m))%m;}
static long ModInv(long a,long m){return Modpow(a,m-2,m);}
static long nck(int n,int r,long m){if(r>n){return 0l;}return Modmul(f[n],ModInv(Modmul(f[n-r],f[r],m),m),m);}
static long[] f;
static long mod=(long)1e9+7;
//......................................@uthor_Alx..............................................
  static int f(char[][] c){
  	int res=0;
  	 for(int i=0;i<c.length;i++){
  	 	for(int j=0;j<c[0].length;j++){
  	 		if(c[i][j]=='#'){
  	 			res++;
  	 		}
  	 	}
  	 }
  	 return res;
  }
   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  	int n=int_v(read());
	        		  	int[] arr=int_arr();
	        		  	Arrays.sort(arr);
	        		  	long s=0;
	        		  	for(int i:arr){s+=i;}
	        		  	s-=arr[0];
	        		  	out.write(s+"");
                      	out.flush();
	        		 
	}
}
	       

	       
