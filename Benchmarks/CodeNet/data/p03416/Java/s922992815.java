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

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		int a=sc.nextInt(),b=sc.nextInt();
		int cnt=0;
		for(int i=a;i<=b;i++){
			String aa=i+"";
			int ind=aa.length()-1;
			boolean f=true;
			for(int j=0;j<aa.length()/2;j++){
				if(aa.charAt(j) !=aa.charAt(ind)){
					f=false;
					break;
				}
				ind--;
			}
			if(f)cnt++;
		}
		System.out.println(cnt);
	}
}