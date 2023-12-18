import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
		
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		String s=sc.next();
		int n=s.length();
		String p="";
		int y=0;
		for(int i=0;i<n;i++) {
			p+=s.substring(i,i+1);
			y++;
			if(y>=2) {
				
				while(y>=2&&p.charAt(y-1)!=p.charAt(y-2)) {
					
					if(y==2) {
						
						p="";
						y=0;
					}else {
					p=p.substring(0,y-2);
					y-=2;
					}
					if(y<=1) {
						break;
					}
				}
			}
		}
		
		
		int ans=p.length();
		System.out.println(n-ans);
		
	}

	
	
	
	
	
	
//----------------------------------------------------------
	static int l_min(int[] a) {
		Arrays.sort(a);
		return a[0];
	}
	static int l_max(int[] a) {
		int l=a.length;
		Arrays.sort(a);
		return a[l-1];
	}
	
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
	

}
