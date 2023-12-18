import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Otoshidama solver = new Otoshidama();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class Otoshidama {

		private int y;
		private int n;

		private Scanner scanner;
		private String output;

		public Otoshidama() {
			scanner = new Scanner(System.in);
		}

		public void readInput() {
			n = Integer.parseInt(scanner.next());
			y = Integer.parseInt(scanner.next());
			return ;
		}

		public void solve() {
			for(int a=0;a<=n;a++) {
				for(int b=0;b<=n-a;b++) {
					if ((y-a*10000-b*5000-(n-a-b)*1000) == 0) {
						output = String.format("%d %d %d", a,b,(n-a-b));
						return ;
					}
				}
			}
			output = "-1 -1 -1";
			return;
		}

		public void writeOutput() {
			System.out.println(output);
			return;
		}

	}

}
