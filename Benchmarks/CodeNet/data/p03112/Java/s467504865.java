import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
		
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int q=sc.nextInt();
		long s[]=new long[a+2];
		long t[]=new long[b+2];
		long ans[]=new long[q];
		for (int i = 1; i <= a; i++) {
			s[i]=sc.nextLong();
		}
		for (int i = 1; i <= b; i++) {
			t[i]=sc.nextLong();
		}
		s[0]=-100000000000L;
		t[0]=-100000000000L;
		s[a+1]=100000000000L;
		t[b+1]=100000000000L;
		
		long x[]=new long[q];
		for (int i = 0; i < q; i++) {
			x[i]=sc.nextLong();
		}
		
		

		int sl[]=new int[q];
		int tl[]=new int[q];
		long temp1;
		long temp2;
		for (int i = 0; i < q; i++) {
			sl[i]=nib(s,x[i],0,a+1);
			tl[i]=nib(t,x[i],0,b+1);
			ans[i]=Long.MAX_VALUE;
			for(int m=0;m<2;m++) {
				for(int n=0;n<2;n++) {
					temp1=Math.abs(x[i]-t[tl[i]+m])+Math.abs(t[tl[i]+m]-s[sl[i]+n]);
					temp2=Math.abs(x[i]-s[sl[i]+n])+Math.abs(t[tl[i]+m]-s[sl[i]+n]);
					ans[i]=Math.min(ans[i],temp1);
					ans[i]=Math.min(ans[i],temp2);
				}
				
			}
		
		}
		
		for (int i = 0; i < q; i++) { 
			System.out.println(ans[i]);
		}
		
		
	}
	static int nib(long[] a,long x,int l,int r) {
		int an;
		
		
		if(a[l]<x&&x<a[r]) {
			
			if(r-l==1) {
				an=l;
				
			}else {
				
				an=nib(a,x,0,(l+r)/2);
				if(an==-1) {
					an=nib(a,x,(l+r)/2,r);
				}
				
			}
		}else {
			
			an=-1;
		}
		
		
		return an;
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
