import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	private void doit() {
		Scanner sc = new Scanner(System.in);
		int n, max, ind, id, sum;
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			max = 0;
			ind = -1;
			while(n-- > 0) {
				id = sc.nextInt();
				sum = sc.nextInt() + sc.nextInt();
				if (max < sum) {
					max = sum;
					ind = id;
				}
			}
			System.out.println(ind + " " + max);
		}
	}

	class InStream{
		BufferedReader in;StringTokenizer st;
		public InStream() {
			this.in = new BufferedReader(new InputStreamReader(System.in));
			this.st = null;
		}
		String next() {
			while (st==null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.readLine());
				} catch (Exception e) {}
			}
			return st.nextToken(); 
		}
		boolean hasNext(){
			try {
				st = new StringTokenizer(in.readLine());
				return true;
			} catch (Exception e) {return false;}
		}
		int nextInt() {	return Integer.parseInt(next()); }
		long nextLong() {return Long.parseLong(next());	}
		double nextDouble() {return Double.parseDouble(next());	}
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}