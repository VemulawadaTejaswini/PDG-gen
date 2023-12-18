import java.math.*;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int t = 1;
		while (t-->0) {
		    long[] cnt = new long[200001];
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextInt();
		        cnt[a[i]]++;
		    }
		    long sum = 0;
		    for(int i=0;i<=200000;i++){
		        if(cnt[i]<=1) continue;
		        sum+=(cnt[i]*(cnt[i]-1))/2;
		    }
		    //System.out.println(sum);
		    for (int i=0;i<n ;i++ ){
		        if(cnt[a[i]]<2){
		            System.out.println(sum);
		        }
		        else{
		            long p = cnt[a[i]];
		            System.out.println(sum-(p*(p-1))/2+((p-1)*(p-2))/2);
		        }
		    } 
		}
	}
	static boolean isPalin(String s){
	    int n = s.length();
	    boolean ok = true;
		for(int i=0;i<n/2;i++){
		     if(s.charAt(i)!=s.charAt(n-i-1)){
		            ok = false;
		            break;
		    }
		}
		return ok;
	}
	static class Query {
		int x1, x2, y, id;
		public Query(int c, int d, int e, int a){
			x1 = c;
			x2 = d;
			y = e;
			id = a;
		}
	}
	static class Compare1 implements Comparator<Query>{
		@Override
		public int compare(Query q1, Query q2){
			if(q1.x2==q2.x2) return q1.x1-q2.x1;
			return q1.x2-q2.x2;
		}
	}
	static class Pair implements Comparable<Pair>{
		int a, b;
		public Pair(int c, int d){
			a = c;
			b = d;
		}
		public int compareTo(Pair p){
		    return a-p.a;
		}
	}
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;
		FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}
		String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}
		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}