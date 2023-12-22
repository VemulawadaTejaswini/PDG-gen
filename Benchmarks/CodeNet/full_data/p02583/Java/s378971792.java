import java.util.*;
import java.io.*;

public class Main{

static BufferedReader s1;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}
static int int_v (String s1){
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s1.length();i++){sb.append(s1.charAt(i));}
    return Integer.parseInt(sb.toString());
}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split("\\s+");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split("\\s+");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}
//......................................@uthor_Alx..............................................

public static void main(String[] args) throws  IOException{
                assign();
                int t=1;//read().charAt(0)-'0',cn=1;
                while(t--!=0){
                	int n=int_v(read());
                    int[] a=int_arr(); int res=0;
                    Arrays.sort(a);
                    boolean[] b=new boolean[n];
                    for(int i=0;i<n;i++){
                    	for(int j=i+1;j<n;j++){
                    		for(int k=j+1;k<n;k++){
                    			if(a[i]!=a[j]&&a[j]!=a[k]&&a[i]!=a[k]){
                    				if(a[i]+a[j]>a[k]){
                    					res++;
                    				}
                    			}
                    		}
                    	}
                    }
                    out.write(res+"\n");            
                }                
                out.flush();

    }
}