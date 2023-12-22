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
	        		  long[] n1=long_arr();
	        		  int n=(int)n1[0];long k=n1[1];//,x=n1[2];//,k=n1[3];
	        		  int[] a1=int_arr();
	        		  int[] a=new int[n+1];
	        		  for(int i=1;i<=n;i++){a[i]=a1[i-1];}
	        		  Set<Integer> s=new HashSet<>();
	        		  List<Integer> l=new ArrayList<>();
	        		  l.add(1); s.add(1);
	        		  int cl=1;
	        		  for(int i=0;i<n;i++){
	        		  	 if(s.contains(a[l.get(l.size()-1)])){
	        		  	 	l.add(a[l.get(l.size()-1)]);
	        		  	 	break;
	        		  	 }
	        		  	 s.add(a[l.get(l.size()-1)]);
	        		  	 l.add(a[l.get(l.size()-1)]); cl++;
	        		  }
	        		  if(k<n){
	        		  	out.write(l.get((int)k)+"");
	        		  	out.flush();return;
	        		  }
	        		  if(l.get(l.size()-1)!=1){
	        		  	int xx=0;
	        		  	 for(int i=0;i<l.size();i++){
	        		  	 	if(l.get(i)==l.get(l.size()-1)){xx=i;break;}
	        		  	 }

	        		  	 cl=l.size()-xx-1;
	        		  	 if(cl!=0){ if(k>=xx){k-=xx;}k%=cl;k=(k+cl)%cl;}
	        		  	// if(k>=xx){k-=xx;}
	        		  	 if(cl!=0){out.write(l.get(xx+(int)k)+"");out.flush();}
	        		  	 else{out.write(l.get((int)k)+"");out.flush();}
	        		  	 return;
	        		  }
	        		  k%=cl;
	        		  	  out.write(l.get((int)k)+"");
	        		  
	        		  
	        		  
	        		  
	        	
                      out.flush();
	        		 
	}
}
	       
	          



	
  



