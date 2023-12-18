import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		MoveAndWin solver = new MoveAndWin();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}
	static class MoveAndWin {
		private int n;
		private int a;
		private int b;

		private String output;
		private Scanner scanner;

		public MoveAndWin() {
			this.scanner = new Scanner(System.in);
		}

		public void readInput() {
			n = Integer.parseInt(scanner.next());
			a = Integer.parseInt(scanner.next());
			b = Integer.parseInt(scanner.next());
		}

		public void solve() {
			if(Math.abs(a-b)%2 != 0) {
				output = "Borys";
			} else {
				output = "Alice";
			}
		}

		public void writeOutput() {
			System.out.println(output);
		}

	}
}