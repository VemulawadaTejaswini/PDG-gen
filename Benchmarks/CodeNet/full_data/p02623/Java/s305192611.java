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
//......................................@uthor_Alx..............................................
static void spf(int n, int[] spf){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
          if(spf[i]!=0) continue;
          spf[i]=i;
          for(int j=i*i;j<=n;j+=i){
            if(spf[j]!=0) continue;
            spf[j]=i;
          }
        }
        for(int i=(int)Math.sqrt(n);i<=n;i++){
          if(spf[i]==0) spf[i]=i;
        }
    }
   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  	itn n=int_v(read());
	        		  	
	        		  	out.write((res)+"");
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
//......................................@uthor_Alx..............................................

   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  	int[] x=int_arr();
	        		  	int n=x[0],m=x[1],k=x[2];
	        		  	int[] a=int_arr();
	        		  	int[] b=int_arr();
	        		  	long res=0;
	        		  	int i=0,j=0;
	        		  	while(true){
	        		  		if(i>=n&&j>=m||k<=0){break;}
	        		  		if(i>=n&&k<b[j]){break;}
	        		  		if(j>=m&&k<a[i]){break;}
	        		  		if(i>=n&&k>=b[j]){
	        		  			res++;
	        		  			k-=b[j];
	        		  			j++;
	        		  		}
	        		  		else if(j>=m&&k>=a[i]){
	        		  			res++;
	        		  			k-=a[i];
	        		  			i++;
	        		  		}
	        		  		else if(i<n&&j<m){
	        		  			int xx=Math.min(a[i],b[j]);
	        		  			if(k>=xx){
	        		  				k-=xx;res++;
	        		  			}
	        		  			else{break;}
	        		  			if(xx==a[i]){i++;}
	        		  			else{j++;}
	        		  		}
	        		  	}
	        		  	
	        		  	out.write((res)+"");
                      	out.flush();
	        		 
	}
}
	       
