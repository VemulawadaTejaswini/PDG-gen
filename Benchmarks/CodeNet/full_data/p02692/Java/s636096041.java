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
	        		  int[] n1=int_arr();
	        		  int n=n1[0],a=n1[1],b=n1[2],c=n1[3];
	        		  List<Character> l=new ArrayList<>();
	        		  boolean bb=true;
	        		  for(int i=0;i<n;i++){
	        		  	String s=read();
	        		  	if(s.equals("AB")){
	        		  		if(a==0&&b==0){bb=false;break;}
	        		  		if(a>b){
	        		  			l.add('B');
	        		  			a--;b++;
	        		  		}
	        		  		else{
	        		  			l.add('A');
	        		  			a++;b--;
	        		  		}
	        		  	}
	        		  	if(s.equals("BC")){
	        		  		if(b==0&&c==0){bb=false;break;}
	        		  		if(c>b){
	        		  			l.add('B');
	        		  			c--;b++;
	        		  		}
	        		  		else{
	        		  			l.add('C');
	        		  			c++;b--;
	        		  		}
	        		  	}
	        		  	if(s.equals("AC")){
	        		  		if(a==0&&c==0){bb=false;break;}
	        		  		if(a>c){
	        		  			l.add('C');
	        		  			a--;c++;
	        		  		}
	        		  		else{
	        		  			l.add('A');
	        		  			a++;c--;
	        		  		}
	        		  	}
	        		  }
	        		  if(!bb){out.write("No");}
	        		  else{
	        		  	out.write("Yes\n");
	        		  	for(char cc:l){out.write(cc+"\n");}
	        		  }
	        	
	        		// if(n[0]>0){out.write("Yes");}
	        		 //else{out.write("No");}
                      out.flush();
	        		 
	}
}
	       
	          



	
  



