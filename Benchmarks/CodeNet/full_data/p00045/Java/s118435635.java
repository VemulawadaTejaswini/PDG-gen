import java.util.*;
import java.awt.geom.*;
import java.io.*;
public class Main{
	
	class InStream{
		BufferedReader in;
		StringTokenizer st;
		public InStream() {
			this.in = new BufferedReader(new InputStreamReader(System.in));
			this.st = null;
		}
		
		boolean hasNext(){
			try {
				st = new StringTokenizer(in.readLine());
				return true;
			} catch (Exception e) {return false;}
		}
		
		String next() {
			while (st==null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.readLine());
				} catch (Exception e) {}
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
	}
	
	private void doit(){
		InStream in = new InStream();
		int count = 0, sum = 0, total = 0;
		
		while(in.hasNext()){
			String [] input = in.next().split(",");
			sum += Integer.parseInt(input[1]);
			total += Integer.parseInt(input[0]) * Integer.parseInt(input[1]);
			count++;
		}
		
		double res = (double)sum / count;
		System.out.printf("%d\n%d\n", total, (int)(Math.round(res)));
	}

	public static void main(String [] args){
		new Main().doit();
	}
}