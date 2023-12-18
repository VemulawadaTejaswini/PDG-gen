import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		SunukeColoring2 solver = new SunukeColoring2();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class SunukeColoring2 {

		private int w;
		private int h;
		private int n;

		private int vertex[] = new int[4];

		private Scanner scanner;
		private int output;

		public	SunukeColoring2() {
			scanner = new Scanner(System.in);
		}

		public void readInput() {
			int x,y,a;
			w = new Integer(scanner.next());
			h = new Integer(scanner.next());
			n = new Integer(scanner.next());
			vertex[0] = 0;
			vertex[2] = 0;
			vertex[1] = w;
			vertex[3] = h;
			for(int i=0;i<n;i++) {
				x = new Integer(scanner.next());
				y = new Integer(scanner.next());
				a = new Integer(scanner.next());
				a --;
				switch(a) {
				case 0:
					vertex[a] = Math.max(x,vertex[a]);
					break;
				case 1:
					vertex[a] = Math.min(x,vertex[a]);
					break;
				case 2:
					vertex[a] = Math.max(y,vertex[a]);
					break;
				case 3:
					vertex[a] = Math.min(y,vertex[a]);
					break;
				}
			}
			return ;
		}
		public void solve() {
			int xLen,yLen;

			xLen = vertex[1]-vertex[0];
			yLen = vertex[3]-vertex[2];

			if (xLen<=0 || yLen<=0) {
				output = 0;
				return ;
			}

			output = xLen * yLen;
			return;
		}
		public void writeOutput() {
			System.out.println(output);
			return ;
		}
	}

}
