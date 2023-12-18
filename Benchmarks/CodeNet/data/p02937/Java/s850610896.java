

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
	

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
    public static long mod = (long) (1e9+7);
    public final static int MAX = (int)1e5;
  // static Scanner sc = new Scanner(System.in);
   static List<Integer>[] edge;
	public static void main(String[] args) {
	   
	 FastReader sc = new FastReader();
	 char[] s = sc.next().toCharArray();
	 char[] t = sc.next().toCharArray();
	 TreeSet<Integer>[] set = new TreeSet[26];
	 for(int i=0;i<26;++i) set[i] = new TreeSet<>();
	 
	 for(int i=0;i<s.length;++i) set[s[i]-'a'].add(i+1);
	 
	 long ans = 0;
	 int last = 0;
	 boolean found = true;
	 for(int i=0;i<t.length && found;++i) {
		 
		 if(set[t[i]-'a'].size() == 0) {
			 found = false;
		 }else if(set[t[i]-'a'].higher(last) != null) {
			       ans+=set[t[i]-'a'].higher(last)-last;
			       last = set[t[i]-'a'].higher(last);
		 }else {
			 ans+=s.length-last + set[t[i]-'a'].first();
			 last = set[t[i]-'a'].first();
		 }
		 
		
	 }
	 if(found) out.println(ans);
	 else out.println(-1);
	 
		out.close();
	}
	
	
}
