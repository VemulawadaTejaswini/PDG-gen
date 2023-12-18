import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n=sc.nextInt();
		int[]a=new int[n],b=new int[n],tmpA=new int[n],tmpB=new int[n];
		for(int i=0;i<n;i++) 
			tmpA[i]=sc.nextInt();
			
		for(int i=0;i<n;i++)
			tmpB[i]=sc.nextInt();
		long ans=0;
		for(int k=0;k<30;k++) {
			int T=1<<k;
			for(int i=0;i<n;i++) {
				a[i]=tmpA[i]%(2*T);
				b[i]=tmpB[i]%(2*T);
			}
			

			Arrays.sort(a);
			Arrays.sort(b);
			for(int i=0;i<n/2;i++) {
				int x=b[n-i-1];
				b[n-i-1]=b[i];
				b[i]=x;
			}

			int xor=0;
			int t1=0,t2=0,t3=0,t4=0;
			for(int i=0;i<n;i++) {
				while(t1<n && a[i]+b[t1]>=T)
					t1++;
				while(t2<n && a[i]+b[t2]>=2*T)
					t2++;
				while(t3<n && a[i]+b[t3]>=3*T)
					t3++;
				while(t4<n && a[i]+b[t4]>=4*T)
					t4++;
				int one=Math.max(0, t1-t2),two=Math.max(0, t3-t4);
				xor^=one;
				xor^=two;
			}
			if((xor&1)==1)
				ans+=T;

		}
		out.println(ans);
		out.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

}