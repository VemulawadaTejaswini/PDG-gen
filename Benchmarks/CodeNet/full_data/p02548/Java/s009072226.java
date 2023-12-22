
import java.util.*;
import java.io.*;

public class Main {
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

	

	public static void main(String[] args) throws FileNotFoundException {
	
	
 /*File file =new File("input.txt");
 Scanner scan=new Scanner(new FileInputStream(file));
 PrintWriter out=new PrintWriter("output.txt");
 */
FastReader scan=new FastReader();
 int n=scan.nextInt();
 int count=1;
 int coun0=0;
 int temp=n;
while(temp!=0){
	 temp=n-count;
	for(int i=1;i<=temp;++i){
		if(temp%i==0){
coun0++;
		}
	}
	++count;

}
System.out.println(coun0);

	}
}


