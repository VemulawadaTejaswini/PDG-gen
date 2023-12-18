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


   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  	long[] n1=long_arr();
	        		  int n=(int)n1[0];long k=n1[1];
	        		  int[] a1=int_arr();
	        		  int[] a=new int[n+1];
	        		  for(int i=1;i<=n;i++){a[i]=a1[i-1];}
	        		  boolean[] b=new boolean[n+1];
	        		  List<Integer> l=new ArrayList<>();
	        		  l.add(1); b[1]=true;;
	        		  int cl=1;
	        		  for(int i=0;i<n;i++){
	        		  	int z=a[l.get(l.size()-1)];
	        		  	 if(b[z]){
	        		  	 	l.add(z);
	        		  	 	break;
	        		  	 }
	        		  	 b[z]=true;
	        		  	 l.add(z);
	        		  }

	        		  	int xx=0;
	        		  	 for(int i=0;i<l.size();i++){
	        		  	 	if(l.get(i)==l.get(l.size()-1)){xx=i;break;}
	        		  	 }
	        		  	 if(k<l.size()){
	        		  	 	out.write(l.get((int)k)+"");
	        		  	 	out.flush(); return;
	        		  	 }
	        		  	 cl=l.size()-xx;
	        		  	  k-=xx;
	        		  	 k%=cl;
	        		  	 	out.write(l.get(xx+(int)k)+"");
	
                      out.flush();
	        		 
	}
}
	       
	          



	
  





	
  



