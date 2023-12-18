import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		String s=sc.next();
		StringBuilder sb = new StringBuilder(s);
		int l=s.length();
		long count=0;
		int now=0;
		boolean roop=true;
		boolean last=true;
		
		if(l==1) {
			System.out.println("0");
		}
		else {
			
		
				while(roop) {
			
					if(now==l-1&&!last) {
						now=0;
						last=true;
					}
					else if(now==l-1&&last) {
						roop=false;
						break;
					}
			
					else if(sb.charAt(now)=='B'&&sb.charAt(now+1)=='W') {
						sb.setCharAt(now,'W');
						sb.setCharAt(now+1,'B');
						count++;
						last=false;
					}
					now++;
				}
				System.out.println(count);
			}
	}
		
	//-----------http://codeforces.com/blog/entry/7018---------------------------------
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
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
	//--------------------------------------------------------

}



