
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



 class A{
	




	public static void main(String[] args) throws IOException {
		
		
		FastScanner sc=new FastScanner();
		
		int n = sc.nextInt();
		int x = sc.nextInt(),t = sc.nextInt();
		int val = n/x * t;
		if(n%x != 0)
			val+=t;
		System.out.println(val);
		
		
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
		long[] readArrayLong(int n) {
        	long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
        }
		long nextLong() {
			return Long.parseLong(next());
		}
		String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
	}
}
