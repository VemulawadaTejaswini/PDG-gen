import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		TakashiInfo solver = new TakashiInfo();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class TakashiInfo {

		private int map[][] = new int[3][3];

		private Scanner scanner;
		private String output;

		public TakashiInfo() {
			scanner = new Scanner(System.in);
		}

		public void readInput() {
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					map[i][j] = Integer.parseInt(scanner.next());
				}
			}
		}
		public void solve() {
			for(int i=0;i<3;i++) {
				for(int j=1; j<3; j++) {
					map[i][j]-= map[i][0];
				}
			}
			output = (map[0][1]==map[1][1] && map[1][1]==map[2][1] && map[0][2]==map[1][2] && map[1][2]==map[2][2])? "Yes":"No";
		}


		public void writeOutput() {
			System.out.println(output);
		}
	}

}
