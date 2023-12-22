import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static HashMap<Integer,Integer> hm;
//	static int mx;
	
	public static int gcd(int a,int b) {
		
		while(b!=0) {
			int tmp=a;
			a=b;
			b=tmp%b;
		}
		return a;
	}
	
	public static boolean solve() {
		
		for(int p=2;p<=1000;p++) {
			
			int mul=1;
			int ctr=0;
			
			while(p*mul<=1000000) {
				if(hm.containsKey(p*mul)) {
					ctr++;
				}
				mul++;
			}
			if(ctr>=2) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Rf.init(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		
		int N=Rf.nextInt();
		int[] A=new int[N];
		
		hm=new HashMap<Integer,Integer>();
		
		for(int x=0;x<N;x++) {
			A[x]=Rf.nextInt();
//			mx=Math.max(mx,A[x]);
			hm.put(A[x],1);
		}	
			
		int setwise=A[0];
		for(int h=1;h<N;h++) {
			setwise=gcd(setwise,A[h]);
		}
		
		if(setwise!=1) {
			pw.println("not coprime");
		}
		else {
			boolean check = solve();
			if(check) {
				pw.println("pairwise coprime");
			}
			else {
				pw.println("setwise coprime");
			}
		}
		
		pw.close();
		
	}

}

/** Class for buffered reading int and double values */
class Rf {
	static BufferedReader reader;
	static StringTokenizer tokenizer;

	/** call this method to initialize reader for InputStream */
	static void init(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}

	/** get next word */
	static String next() throws IOException {
		while (!tokenizer.hasMoreTokens()) {
			// TODO add check for eof if necessary
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
	
	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}
}
