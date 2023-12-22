//package cp;
import java.util.*;
import java.io.*;
public class Main {
	long gcd(long a,long b) {if(b==0)return a;else return gcd(b,a%b);}
	void swap(long a,long b) {long temp=a;a=b;b=temp;}
	StringBuilder sb=new StringBuilder();
	Integer[] ARR=new Integer[5];
	//Integer sort-TLE-Initialize object elements i.e a[0].
	long ceil(int n) {return (long)Math.ceil(1.0*n/2);}
	void divisor(long n,int start) {
		int cnt=0;for(int i=start;i<=Math.sqrt(n);i++) {
		if(n%i==0) {if(i==n/i)cnt++;else cnt+=2;}}}
	
	public static void main(String[] args) throws IOException {	
		PrintWriter out = new PrintWriter(System.out);
		Readers.init(System.in);
		Main obj=new Main();
		int x=Readers.nextInt();
		if(x<=599)System.out.println(8);
		else if(x<=799)System.out.println(7);
		else if(x<=999)System.out.println(6);
		else if(x<=1199)System.out.println(5);
		else if(x<=1399)System.out.println(4);
		else if(x<=1599)System.out.println(3);
		else if(x<=1799)System.out.println(2);
		else if(x<=1999)System.out.println(1);
		out.flush();
	}

}
class Readers {
 
    static BufferedReader reader;
 
    static StringTokenizer tokenizer;
 
 
 
    /** call this method to initialize reader for InputStream */
 
    static void init(InputStream input) {
 
        reader = new BufferedReader(
 
                     new InputStreamReader(input) );
 
        tokenizer = new StringTokenizer("");
 
    }
 
 
 
    /** get next word */
 
    static String next() throws IOException {
 
        while ( ! tokenizer.hasMoreTokens() ) {
 
            //TODO add check for eof if necessary
 
            tokenizer = new StringTokenizer(
 
                   reader.readLine() );
 
        }
 
        return tokenizer.nextToken();
 
    }
 
 
 
    static int nextInt() throws IOException {
 
        return Integer.parseInt( next() );
 
    }
 
	
 
    static double nextDouble() throws IOException {
 
        return Double.parseDouble( next() );
 
    }
    
    
    static long nextLong() throws IOException{
    	
		return Long.parseLong(next());
	}
 
}
