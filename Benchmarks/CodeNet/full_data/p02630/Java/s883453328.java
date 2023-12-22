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
 static List<Character> l;
 static void rec(long n,String s){
 	if(n<=26l){
 		 l.add(s.charAt(((int)n-1+26)%26));
 		return;
 	}
 	long k=n/26l;int r=(int)(n%26l);
 	
 	l.add(s.charAt((r-1+26)%26));
 	rec(k,s);
 }
   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  	int n=int_v(read());
	        		  	int[] arr=int_arr();
	        		  	long sum=0;
	        		  	Map<Integer,Integer> map=new HashMap<>();
	        		  	for(int i=0;i<n;i++){
	        		  		sum+=arr[i];
	        		  		map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	        		  	}
	        		  	int q=int_v(read());
	        		  	while(q--!=0){
	        		  		int[] b=int_arr();
	        		  		long s1=sum-(long)map.getOrDefault(b[0],0)*b[0]+(long)map.getOrDefault(b[0],0)*b[1];
	        		  		sum=s1;
	        		  		int f=map.getOrDefault(b[0],0);
	        		  		map.remove(b[0]);
	        		  		map.put(b[1],map.getOrDefault(b[1],0)+f);
	        		  		out.write(s1+"\n");
	        		  	}

	        		  	//out.write(res+"");
                      	out.flush();
	        		 
	}
}
	       