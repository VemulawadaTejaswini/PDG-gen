//package cp;
import java.util.*;
import java.io.*;
public class Main {
	long gcd(long a,long b) {if(b==0)return a;else return gcd(b,a%b);}
	void swap(long a,long b) {long temp=a;a=b;b=temp;}
	StringBuilder sb=new StringBuilder();
	Integer[] ARR=new Integer[5];
	//Integer sort-TLE-Initialize object elements i.e a[0].
	long ceil(double n) {
//		System.out.println(n);
		return (long)Math.ceil(1.0*n);}
	void divisor(long n,int start) {
		int cnt=0;for(int i=start;i<=Math.sqrt(n);i++) {
		if(n%i==0) {if(i==n/i)cnt++;else cnt+=2;}}}
	
	public static void main(String[] args) throws IOException {	
		PrintWriter out = new PrintWriter(System.out);
		Readers.init(System.in);
		Main obj=new Main();
		int a=Readers.nextInt();
		int b=Readers.nextInt();
		int c=Readers.nextInt();
		int k=Readers.nextInt();
		long ans=0;
		long ans2=0;
		int num2=0;
		int val=b;
		if(b>a)num2=b/c;
		else {
			int num1=a/b;
			ans=obj.ceil(1.0*Math.log(num1)/Math.log(2));
			if(Math.pow(2, ans)==num1)ans++;
			val=b*(int) Math.pow(2, ans);
//			System.out.println(val);
			num2=val/c;
		}
		if(c>val);
		else {
//			System.out.println(num2+" oh");
			ans2=obj.ceil(1.0*Math.log(num2)/Math.log(2));
			if(Math.pow(2, ans2)==num2)ans2++;
		}
//		System.out.println(ans+" "+ans2);
		if(ans+ans2<=k)System.out.println("Yes");
		else System.out.println("No");
		out.flush();
	}
//	7 8 2
//	4

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
