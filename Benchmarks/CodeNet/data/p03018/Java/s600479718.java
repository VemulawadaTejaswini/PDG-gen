import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[] ary;
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		String s=sc.next();
		ArrayList<Integer> block=new ArrayList<Integer>();
		for(int i=0; i<s.length(); i++) {
			if(i<s.length()-1) {
				if(s.charAt(i)=='A') {
					block.add(1);
				}
				else if(s.charAt(i)=='B' && s.charAt(i+1)=='C') {
					block.add(2);
				}
				else {
					block.add(0);
				}
			}
			else {
				if(s.charAt(i)=='A') {
					block.add(1);
				}
				else {
					block.add(0);
				}
			}
		}
		int[] n=new int[block.size()];
		for(int i=0; i<block.size(); i++) {
			n[i]=block.get(i);
		}
		int counter=0;
		long sum=0;
		while(counter<n.length-1) {
			if(n[counter]==1 && n[counter+1]==2) {
				sum++;
				n[counter]=2;
				n[counter+1]=1;
				if(counter==0) {
					counter++;
				}
				else {
					counter--;
				}
			}
			else {
				counter++;
			}
		}
		pl(sum);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}