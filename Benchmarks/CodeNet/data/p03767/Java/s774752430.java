import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AtCoderGroupContest solver = new AtCoderGroupContest();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class AtCoderGroupContest {

		private int n;
		private ArrayList<Integer> a;
		private long  output;
		private Scanner scanner;

		public AtCoderGroupContest() {
			scanner = new Scanner(System.in);
			a = new ArrayList<Integer>();
		}
		public void readInput() {
			n = scanner.nextInt();
			for(int i=0; i<3*n;i++) {
				a.add(scanner.nextInt());
			}
		}

		public void solve() {
			Collections.sort(a,Collections.reverseOrder());
			for(int i=0; i<n*2;i++) {
				if(i%2==1) {
					output+=a.get(i);
				}
			}
		}

		public void writeOutput() {
			System.out.print(output);
		}
	}

}
