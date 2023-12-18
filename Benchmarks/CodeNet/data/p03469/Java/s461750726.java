import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Already solver = new Already();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class Already {

		private String input;
		private String answer;
		private Scanner scanner;


		public Already() {
			scanner = new Scanner(System.in);
		}

		public void readInput() {
			input = scanner.next();
		}

		public void solve() {
			answer = input.replace("2017","2018");
		}

		public void writeOutput() {
			System.out.println(answer);
		}
    }
}
