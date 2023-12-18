import java.util.*;
import java.io.*;

class TreeRestore {
	public static void main (String[] args) {
		Reader in = new Reader ();
		int n = in.nextInt();
		int [] d = new int [n + 5];
		int [] cnt = new int [n + 5];
		
		int diametre = 0;
		for(int i = 1; i <= n; i++) {
			d[i] = in.nextInt();
			cnt[d[i]] += 1;
			diametre = Math.max(diametre, d[i]);
		}
		boolean ans = true;
		if(diametre >= n) ans = false;
		if(diametre % 2 == 1) {
			int mid = (diametre >> 1) + 1;
			for(int i = mid; i <= diametre; i++) {
				if(cnt[i] > 1) {
					cnt[i] -= 2;
				} else {
					ans = false;
					break;
				}
			}
			for(int i = 0; i <= n; i++) {
				if(cnt[i] > 0) {
					if(i <= mid) ans = false;
				}
			}
		} else {
			int mid = diametre >> 1;
			for(int i = mid; i <= diametre; i++) {
				if(i == mid) {
					if(cnt[i] > 0) {
						cnt[i] -= 1;
					} else {
						ans = false;
						break;
					}
				} else {
					if(cnt[i] > 1) {
						cnt[i] -= 2;
					} else {
						ans = false;
						break;
					}
				}
			}
			for(int i = 0; i <= n; i++) {
				if(cnt[i] > 0) {
					if(i <= mid) ans = false;
				}
			} 
		}
		if(ans) System.out.println("Possible");
		else System.out.println("Impossible");
	}
	static class Reader {
		private BufferedReader a;
		private StringTokenizer b;
		Reader() {
			a = new BufferedReader (new InputStreamReader (System.in));
		} 
		public String next () {
			while(b == null || !b.hasMoreTokens()) {
				try {
					 b = new StringTokenizer (a.readLine());
				 } catch (IOException e) {
					 e.printStackTrace();
				 }
			 }
			 return b.nextToken();
		}
		public int nextInt () {
		     return Integer.parseInt(next());
		}
		public long nextLong () {
			return Long.parseLong(next());
		}
		public double nextDouble () {
			return Double.parseDouble(next());
		}
		public String nextLine () {
		 	try {
		 		return a.readLine();
		 	} catch (IOException e) {
		 		e.printStackTrace ();
		 	}
		 	return "##";
		}
	}
}
