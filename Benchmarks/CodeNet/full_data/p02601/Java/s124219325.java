import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;

public class Main{

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
	   int  a= fs.nextInt();
	   int b=fs.nextInt();
	   int c=fs.nextInt();
	   int k=fs.nextInt();
	   int i=0;
	   while(i<k) {
		   if(a>=b) {
			   b=b*2;
			   i++;
		   }
		   else {
			   break;
		   }
	   }
	   while(i<k) {
		   if(b>=c) {
			   c=c*2;
			   i++;
		   }
		   else {
			   break;
		   }
	   }
	   if(a<b&&b<c) {
		   System.out.println("Yes");
	   }
	   else {
		   System.out.println("No");
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
