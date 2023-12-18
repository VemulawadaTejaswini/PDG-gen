import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		NotFound solver = new NotFound();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class NotFound {

		private String s;
		private String output;
		private Scanner scanner;

		public NotFound() {
			this.scanner = new Scanner(System.in);
		}

		public void readInput() {
			s = scanner.next();
			return ;
		}
		public void solve() {

			boolean set[] = new boolean[26];

			for(char c:s.toCharArray()) {
				set[c-'a'] = true;
			}

			for (int i=0; i<26; i++) {
				if(!set[i]) {
					output = String.valueOf((char)(i+'a'));
					return;
				}
			}
			output = "None";
			return ;
		}
		public void writeOutput() {
			System.out.println(output);
			return ;
		}

	}


}