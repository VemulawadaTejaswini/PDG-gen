import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SomeSums solver = new SomeSums();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class SomeSums {

		private int n;
		private int a;
		private int b;
		private Scanner scanner;
		private int output;

		public SomeSums() {
			scanner = new Scanner(System.in);
			output = 0;
		}

		public void readInput() {
			n = scanner.nextInt();
			a = scanner.nextInt();
			b = scanner.nextInt();
		}

		public void solve() {
			int t,sum;
			for(int i=1; i<=n;i++) {
				t = i;
				sum = 0;
				while(t!=0) {
					sum += t%10;
					t /= 10;
				}
				if(sum>=a && sum <= b) {
					output += i;
				}
			}
		}

		public void writeOutput() {
			System.out.println(output);
		}
	}
}
