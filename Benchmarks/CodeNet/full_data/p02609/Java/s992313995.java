import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	static int mod;
	static long[] twoPowM1=new long[300_000], twoPowM2=new long[300_000];
	static long[] stepsSmall=new long[300_000];
	
	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=fs.nextInt();
		char[] line=fs.next().toCharArray();
		int bitCount=0;
		for (char c:line) if (c=='1') bitCount++;
		mod=bitCount-1;
		if (mod>0) {
			twoPowM1[0]=1;
			for (int i=1; i<twoPowM1.length; i++) twoPowM1[i]=add(twoPowM1[i-1], twoPowM1[i-1]);
		}
		mod=bitCount+1;
		twoPowM2[0]=1;
		for (int i=1; i<twoPowM2.length; i++) twoPowM2[i]=add(twoPowM2[i-1], twoPowM2[i-1]);
		
		stepsSmall[0]=0;
		for (int i=1; i<stepsSmall.length; i++) stepsSmall[i]=1+stepsSmall[i%Integer.bitCount(i)];
		
		long valM1=0, valM2=0;
		for (char c:line) {
			mod=bitCount-1;
			if (mod>0) {
				valM1=add(mul(valM1, 2), c-'0');
			}
			mod=bitCount+1;
			valM2=add(mul(valM2, 2), c-'0');
		}
		
		for (int i=0; i<n; i++) {
			int power=n-1-i;
			if (line[i]=='0') {
				//care about valM2
				mod=bitCount+1;
				long newVal=add(valM2, twoPowM2[power]);
				out.println(stepsSmall[(int)newVal]+1);
			}
			else {
				mod=bitCount-1;
				if (mod==0) {
					out.println(0);
				}
				else {
					long newVal=sub(valM1, twoPowM1[power]);
					out.println(stepsSmall[(int)newVal]+1);
				}
			}
		}
		out.close();
	}
	
	static long add(long a, long b) {
		return (a+b)%mod;
	}
	
	static long sub(long a, long b) {
		return ((a-b)%mod+mod)%mod;
	}
	
	static long mul(long a, long b) {
		return (a*b)%mod;
	}

	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

	
}
