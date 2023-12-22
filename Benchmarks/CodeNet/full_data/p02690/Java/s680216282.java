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
	        		  long x=long_v(read());
	        		  Map<Long,Integer> map=new HashMap<>();
	        		  for(int i=-1000;i<=1000;i++){
	        		  	long xx=(long)i*i*i*i*i;
	        		  	map.put(xx,i);
	        		  }
	        		  for(int i=-1000;i<=1000;i++){
	        		  	long xx=(long)i*i*i*i*i+x;
	        		  	if(map.get(xx)!=null){
	        		  		out.write(map.get(xx)+" "+i);
	        		  		out.flush();
	        		  		break;
	        		  	}
	        		  }
	        		  //out.write(res+"");
	        	
	        		// if(n[0]>0){out.write("Yes");}
	        		 //else{out.write("No");}
                      //out.flush();
	        		 
	}
}
	       
	          



	
  



