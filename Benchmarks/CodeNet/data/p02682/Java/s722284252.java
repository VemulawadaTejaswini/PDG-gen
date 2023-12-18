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
//Atlanta       83 71  8  0 1 6 1
//Atlanta       83 71  8  0 1 6 1
   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  int[] n1=int_arr();
	        		  int a=n1[0],b=n1[1],c=n1[2],k=n1[3];
	        		 // int[] arr=int_arr();
	        		 int res=Math.min(a,k);
	        		 k-=res;
	        		 k-=Math.min(b,k);
	        		 if(k>0){res-=k;}
	        		  out.write(res+"");
	        		  
	        	
                      out.flush();
	        		 
	}
}
	       
	          



	
  



