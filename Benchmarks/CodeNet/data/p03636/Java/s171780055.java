import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		I18n solver = new I18n();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class I18n {

		private String input;
		private String answer;
		private Scanner scanner;



		public I18n() {
			scanner = new Scanner(System.in);
		}

		public void readInput() {
			input = scanner.next();
		}

		public void solve() {
			int t = input.length()-2;
			answer = input.charAt(0) + String.valueOf(t) + input.charAt(input.length()-1);
		}

		public void writeOutput() {
			System.out.println(answer);
		}
	}
}
