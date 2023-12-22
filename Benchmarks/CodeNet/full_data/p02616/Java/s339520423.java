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
  static int f(int[] a, int[] b){
  		return a[0]-b[0];
  }
  static long f1(int[][] b, int k){
  	 long res=1l; int n=b.length;
  	 for(int i=1;i<=k;i++){
  	 	res=Modmul(res,(long)b[n-i][0]*b[n-i][1],mod);
  	 }
  	 return res;
  }

  static long f2(int[][] b, int k){
  		long res=1l; int n=b.length;
  		long max=Long.MIN_VALUE;
  		long max1=Long.MAX_VALUE; int j=-1;
  		for(int i=k+1;i<=n;i++){
  			max=Math.max(max,(long)b[n-i][1]*b[n-i][0]);
  		}
  		for(int i=1;i<=k;i++){
  			if((long)b[n-i][0]*b[n-i][1]<max1){
  				max1=(long)b[n-i][0]*b[n-i][1];
  				j=i;
  			}
  		}
  		b[n-j][1]=max<0?-1:1;
  		b[n-j][0]=Math.abs((int)max);
  		return f1(b,k);
  }
   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  	int[] x=int_arr();
	        		  	int n=x[0],k=x[1];
	        		  	int[] a=int_arr();
	        		  	int[][] b=new int[n][2];
	        		  	for(int i=0;i<n;i++){
	        		  		b[i][0]=Math.abs(a[i]);
	        		  		if(a[i]>=0){
	        		  			b[i][1]=1;
	        		  		}
	        		  		else{
	        		  			b[i][1]=-1;
	        		  		}
	        		  	}
	        		  	Arrays.sort(b,(a1,b1)->f(a1,b1));
	        		  	int mc=0,pc=0;
	        		  	for(int i=1;i<=k;i++){
	        		  		if(b[n-i][1]==1){
	        		  			pc++;
	        		  		}
	        		  		else{
	        		  			mc++;
	        		  		}
	        		  	}
	        		  	long res=0;
	        		  	if(mc%2==0){
	        		  		res=f1(b,k);
	        		  	}
	        		  	else{
	        		  		res=f2(b,k);
	        		  	}
	        		  	res+=mod;
	        		  	res%=mod;
	        		  	out.write(res+"");
                      	out.flush();
	        		 
	}
}
	       

	       
