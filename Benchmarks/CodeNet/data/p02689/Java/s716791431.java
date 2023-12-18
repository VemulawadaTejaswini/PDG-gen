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


   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  //aint n=int_v(read());
	        		  int[] hm=int_arr();
	        		  int[] hi=int_arr();
	        		  Set<Integer>[] l=new HashSet[hm[0]+1];
	        		  for(int i=0;i<=hm[0];i++){l[i]=new HashSet<>();}
	        		  for(int i=1;i<=hm[1];i++){
	        		  	int[] x=int_arr();
	        		  	l[x[0]].add(x[1]);
	        		  	l[x[1]].add(x[0]);
	        		  }
	        		  int res=0;
	        		  for(int i=1;i<=hm[0];i++){
	        		  	int tmp=0;
	        		  	 for(int j:l[i]){
	        		  	 	tmp=Math.max(tmp,hi[j-1]);
	        		  	 }
	        		  	 if(hi[i-1]>tmp){res++;}
	        		  }
	        		  out.write(res+"");
	        	
	        		// if(n[0]>0){out.write("Yes");}
	        		 //else{out.write("No");}
                      out.flush();
	        		 
	}
}
	       
	          



	
  



