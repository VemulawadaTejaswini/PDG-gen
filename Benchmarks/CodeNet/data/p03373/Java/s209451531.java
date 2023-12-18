import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		HalfAndHalf solver = new HalfAndHalf();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class HalfAndHalf {

		private int a;
		private int b;
		private int c;
		private int x;
		private int y;

		private Scanner scanner;
		private int output;

		public HalfAndHalf() {
			scanner = new Scanner(System.in);
			output=0;
		}

		public void readInput() {
			a = Integer.parseInt(scanner.next());
			b = Integer.parseInt(scanner.next());
			c = Integer.parseInt(scanner.next());
			x = Integer.parseInt(scanner.next());
			y = Integer.parseInt(scanner.next());
		}

		public void solve() {
			if((a+b) >= c*2) {
				// abを買うほうが安い
				output += (c*2) * Math.min(x, y);
				if(x<y) {
					if(b<c*2) {
						output += b*(y-x);
					} else {
						output += (c*2)*(y-x);
					}
				} else if(y<x) {
					if(a<c*2) {
						output += a*(x-y);
					} else {
						output += c*2*(x-y);
					}
				}
			} else {
				output += a*x + y*b;
			}
		}




		public void writeOutput() {
			System.out.println(output);
		}

	}

}
