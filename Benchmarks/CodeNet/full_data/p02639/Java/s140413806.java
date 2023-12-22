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

//......................................@uthor_Alx..............................................
static int g=2;
static int f(int[] a, int[] b){
	if(a[0]+a[1]>=g&&b[0]+b[1]>=g){
		return a[0]-b[0];
	}
	return b[0]+b[1]-a[0]-a[1];
}
   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  	int[] a=int_arr();
	        		  	for(int i=0;i<a.length;i++){
	        		  		if(a[i]==0){
	        		  			out.write(i+1+"");
	        		  			break;
	        		  		}
	        		  	}
	
                      out.flush();
	        		 
	}
}
	       
	          



	
  





	
  



