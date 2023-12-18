import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		Long k=sc.nextLong();
		Long x=0L;
		Long ans=0L;
		Long a[]=new Long[n];
		String a_[]=new String[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
			String abit=Long.toBinaryString(a[i]);
			
			a_[i]=String.format("%41s",abit);
			
			
		}
		int count[]=new int[41];
		for(int j=0;j<=40;j++) {
			for(int i=0;i<n;i++) {
				if(a_[i].charAt(j)=='1') {
					count[j]++;
				}
			}
			
			if(2*count[j]<n&&(long)Math.pow(2,40-j)+x<=k) {
				x+=(long)Math.pow(2,40-j);
			}
			
		}
		for(int i=0;i<n;i++) {
			ans+=x^a[i];
		}
		System.out.println(ans);
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



