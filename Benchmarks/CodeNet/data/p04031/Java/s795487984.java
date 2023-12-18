import java.util.*;
import java.io.*;
import java.math.*;
public class  Main{

	public static void main(String[] args) {
		FastScanner I=new FastScanner();
		Output o=new Output();
		int n=I.nextInt();
		int[] arr=new int[n];
		long sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=I.nextInt();
			sum+=arr[i];
		}
		long y=(int)Math.round((double)sum/n);
		long ans=0;
		for(int i=0;i<n;i++) {
			ans+=(arr[i]-y)*(arr[i]-y);
		}
		System.out.println(ans);
		

	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());};
	}

	static class Output{
		PrintWriter w=new PrintWriter(System.out);
		void pln(int x) {w.println(x); w.flush();}
		void pln(long x) {w.println(x); w.flush();}
		void pln(String x) {w.println(x); w.flush();}
		void pln(char x) {w.println(x); w.flush();}
		void pln(StringBuilder x) {w.println(x); w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
	}
}
