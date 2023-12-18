import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
		
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		int k=sc.nextInt();
		int x[]=new int[n];
		for (int i = 0; i < n; i++) {
			x[i]=sc.nextInt();
		}
		int o=0;
		if(l_max(x)<0) {
			o=n;
		}else if(x[0]>0){
			o=0;
			
		}else {	
			while(x[o]<0) {
				o++;
			}
		}	
		int ans=1000000000;
		int ans1;
		int ans2;
		for(int i=0;i<=n-k;i++) {
			if(i<=o+1&&o-1<=i+k-1) {
				ans1=Math.abs(x[i])+x[i+k-1]-x[i];
				ans2=Math.abs(x[i+k-1])+x[i+k-1]-x[i];
				ans=Math.min(ans,ans2);
				ans=Math.min(ans,ans1);
			}	
		}
		
		System.out.println(ans);
	
	
	
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
