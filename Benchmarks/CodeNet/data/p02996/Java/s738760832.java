import java.io.*;
import java.util.*;

public class Main {
	
	static long div(long l,long r,long x) {
		return r/x-(l-1)/x;
	}
	static long lcm(long a,long b) {
		return a/gcd(a,b)*b;
	}
	static long gcd(long a,long b) {
		return b==0?a:gcd(b,a%b);
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n=sc.nextInt();
		int []a=new int [n],b=new int [n];
		Integer[]indices=new Integer[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			indices[i]=i;
		}
		Arrays.sort(indices,Comparator.comparingInt(i->b[i]));
		long time=0;
		boolean ans=true;
		for(int idx:indices) {
			time+=a[idx];
			if(time>b[idx]) {
				ans=false;
			}
		}
		
		out.println(ans?"Yes":"No");
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