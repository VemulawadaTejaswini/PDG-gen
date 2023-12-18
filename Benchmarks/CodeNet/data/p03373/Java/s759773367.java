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
				for(int i=0; i<Math.min(x, y);i++) {
					output += (c*2);
				}

				if(x<y) {
					if(b<c) {
						for(int i=0;i<(y-x);i++) {
							output += b;
						}
					} else {
						for(int i=0;i<(y-x);i++) {
							output += (c*2);
						}
					}
				} else if(y<x) {
					if(a<c) {
						for(int i=0;i<(x-y);i++) {
							output += a;
						}
					} else {
						for(int i=0;i<(x-y);i++) {
							output += (c*2);
						}
					}
				}
			} else {
				for(int i=0; i<x; i++) {
					output+=a;
				}
				for(int i=0;i<y;i++) {
					output += b;
				}
			}
		}

		public void writeOutput() {
			System.out.println(output);
		}

	}

}
