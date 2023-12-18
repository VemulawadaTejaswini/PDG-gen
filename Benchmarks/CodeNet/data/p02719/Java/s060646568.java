import java.util.*;
import java.io.*;
  class Main {
     static long gcd(long a,long b){if(b==0){return a;}return gcd(b,a%b);}

static BufferedReader s1;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}
 
  public static void main(String args[]) throws  IOException {
      assign();
    long[] a=long_arr();
    long n=a[0],k=a[1];
    Set<Long> ss=new HashSet<>();
    long res=0;
    
    if(n%k==0){out.write("0");}
    else{out.write(gcd(n,k)+"");}
    
    out.flush();
    
  }
}