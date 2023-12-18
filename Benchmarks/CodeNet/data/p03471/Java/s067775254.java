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
			for(int i=0; i<=n;i++) {
				for(int j=0; j<=n-i; j++) {
					if((10000*i+5000*j+1000*(n-i-j))==y) {
						output = String.format("%d %d %d", i,j,(n-i-j));
						return;
					}
				}
			}
			output = "-1 -1 -1";
			return ;
		}

		public void writeOutput() {
			System.out.println(output);
		}

	}

}