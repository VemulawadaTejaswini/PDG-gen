//package cp;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
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
		int n=Readers.nextInt();
		int k=Readers.nextInt();
		int[] a=new int[n];
		ArrayList<BigInteger> arr=new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			a[i]=Readers.nextInt();
		}
		int pro=1;
		BigInteger mult=new BigInteger("1");
		for (int i = 0; i < a.length; i++) {
			String temp1=Integer.toString(a[i]);
//			String temp2=Integer.toString(pro);
			BigInteger res1=new BigInteger(temp1);
//			BigInteger res2=new BigInteger(temp2);
//			pro=1L*pro*a[i];
//			mult=res1.multiply(res2);
			mult=mult.multiply(res1);
			if(i==k-1)arr.add(mult);
			else if(i>(k-1)) {
				String temp3=Integer.toString(a[i-k]);
				BigInteger res=new BigInteger(temp3);
				mult=mult.divide(res);
//				pro=1L*pro/a[i-k];
				arr.add(mult);
//				System.out.println(mult);
			}
		}
		for (int i = 1; i < arr.size(); i++) {
			if(arr.get(i).compareTo(arr.get(i-1))>0)System.out.println("Yes");
			else System.out.println("No");
		}
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
