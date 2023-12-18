import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
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

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		stones(sc);
		/*
		 * String str =sc.nextLine(); int q=sc.nextInt(); while(q-->0){ int
		 * len=sc.nextInt(); int[] ch=new int[26]; boolean chk=false; for(int
		 * i=0;i<str.length()-len+1;i++){ String sub=str.substring(i, i+len);
		 * System.out.println(sub); boolean p=method(sub); if(p){ chk=true; //
		 * break; } } System.out.println(chk?len:-1);
		 */
	}

	private static void stones(FastReader sc) {
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
		System.out.println((Math.abs(a-c)<=d)||((Math.abs(a-b)<=d&&Math.abs(b-c)<=d))?"Yes":"No");
	}
}