//package cp;
import java.util.*;
import java.io.*;
import java.math.*;;
public class Main {
	BigInteger bi1=new BigInteger("2");//initialize as string
//	1.BigInteger bi=new BigInteger(Readers.next());- take input as biginteger
	StringBuilder sb=new StringBuilder();
//	2.StringBuilder temp=new StringBuilder(str[i-1]);
//	3.String rev=temp.reverse().toString(); convert sb to string
//	4.if(str[i].compareTo(rev)>=0)minn=0;-compare two Strings
//  5.(Initialize as string) - (a.add(b)) - (array initialized with null and not 0)
	Integer[] ARRE=new Integer[5];//Integer sort-TLE-Initialize object elements i.e a[0].
	static final int mod1 = 1000000007;//or 1e9+7
//	6.System.exit(0); to exit from code....esp in recur 
	long gcd(long a,long b) {if(b==0)return a;else return gcd(b,a%b);}
	long ceil(double d) {return (long)Math.ceil(1.0*d);}
	int ch_int(char c) {return Integer.parseInt(String.valueOf(c));}//change char to Integer
	String ch_str(char c) {return String.valueOf(c);}
	String int_str(int num) {return Integer.toString(num);}
	void divisor(long n,int start) {
		int cnt=0;for(int i=start;i<=Math.sqrt(n);i++) {
		if(n%i==0) {if(i==n/i)cnt++;else cnt+=2;}}}
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(System.out);
		Readers.init(System.in);
		//Cf_fiv obj=new Cf_fiv();
		int n=Readers.nextInt();
		int[] a=new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=Readers.nextInt();
		}
		Arrays.sort(a);
		long cnt=0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j <n; j++) {
				for (int k = j+1; k < n; k++) {
					if(a[i]+a[j]>a[k] && a[i]!=a[j] && a[j]!=a[k] && a[k]!=a[i]) {
//						System.out.println(i+" "+j+" "+k);
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
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
