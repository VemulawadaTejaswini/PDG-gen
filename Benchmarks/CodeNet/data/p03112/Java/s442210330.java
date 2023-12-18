import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
	
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int q=sc.nextInt();
		long s[]=new long[a];
		long t[]=new long[b];
		long ans[]=new long[q];
		for (int i = 0; i < a; i++) {
			s[i]=sc.nextLong();
		}
		for (int i = 0; i < b; i++) {
			t[i]=sc.nextLong();
		}
		
		long x[]=new long[q];
		for (int i = 0; i < q; i++) {
			x[i]=sc.nextLong();
		}
		
		
		int sn[]=new int[q];
		int tn[]=new int[q];
		for (int i = 0; i < q; i++) {
			sn[i]=nib(s,x[i],0,a-1);
			tn[i]=nib(t,s[sn[i]],0,b-1);
			ans[i]=Math.abs(s[sn[i]]-t[tn[i]])+Math.min(Math.abs(s[sn[i]]-x[i]),Math.abs(t[tn[i]]-x[i]));
			
			tn[i]=nib(t,x[i],0,b-1);
			sn[i]=nib(s,t[tn[i]],0,a-1);
			
			ans[i]=Math.min(ans[i],ans[i]=Math.abs(s[sn[i]]-t[tn[i]])+Math.min(Math.abs(s[sn[i]]-x[i]),Math.abs(t[tn[i]]-x[i])));
			
		}
		
		
		
		
		
		for (int i = 0; i < q; i++) {
			System.out.println(ans[i]);
		}
		
		
	}
	static int nib(long[] a,long x,int l,int r) {
		int an=0;
		
		
		if(l==r) {
			an=l;
		}else if(x<a[l]) {
			an=l;
		}else if(a[r]<x) {
			an=r;
		}
		else if(a[l]<x&&x<a[r]) {
			if(r-l==1) {
				if(Math.abs(a[l]-x)<Math.abs(a[r]-x)) {
					an=l;
						
				}else {
					an=r;
				}
				
			}else {
				if(nib(a,x,l,(l+r)/2)!=-1) {
					an=nib(a,x,l,(l+r)/2);
				}else {
					an=nib(a,x,(l+r)/2+1,r);
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
