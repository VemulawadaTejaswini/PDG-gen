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

static Long find(int x, int y){
	long xx=(long)(x+y)*(x+y+1);
	return xx/2;
}
   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  int n=int_v(read());
	        		  int[] a=int_arr();
	        		  Map<Integer,Integer> map=new HashMap<>();
	        		  long res=0;
	        		  for(int i=0;i<n;i++){
	        		  	int t2=i+1-a[i],t1=i+1+a[i];
	        		  	res+=map.getOrDefault(t2,0);
	        		  	map.put(t1,map.getOrDefault(t1,0)+1);
	        		  }
	        		  out.write(res+"");
	        	
	        		// if(n[0]>0){out.write("Yes");}
	        		 //else{out.write("No");}
                      out.flush();
	        		 
	}
}
	       
	          



	
  



