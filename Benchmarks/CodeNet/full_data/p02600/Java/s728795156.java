import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
	int x=fs.nextInt();
	if(x>=400&&x<=599) {
		System.out.println(8);
	}
	else if(x>=400&&x<=599) {
		System.out.println(8);
	}
	else if(x>=600&&x<=799) {
		System.out.println(7);
	}
	else if(x>=800&&x<=999) {
		System.out.println(6);
	}
	else if(x>=1000&&x<=1199) {
		System.out.println(5);
	}
	else if(x>=1200&&x<=1399) {
		System.out.println(4);
	}
	else if(x>=1400&&x<=1599) {
		System.out.println(3);
	}
	else if(x>=1600&&x<=1799) {
		System.out.println(2);
	}
	else if(x>=1800&&x<=1999) {
		System.out.println(1);
	}
	}
	static void sort(int[] a ) {
		ArrayList<Integer> l = new ArrayList<>();
		for(int i:a) l.add(i);
		Collections.sort(l);
		for(int i=0;i<l.size();i++) a[i]=l.get(i);
	}
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while(!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				}catch(IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a = new int[n];
			for(int i=0;i<n;i++)a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
