
import java.util.Scanner;

public class Main {

	void	 solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int h = 1; h <= 3500; h++) {
			for(int w = 1; w <= 3500; w++) {
				long u = n * h * w;
				int d = 4 * h * w - n * h - n * w;
				if(d != 0 && u % d == 0 && u / d > 0) {
					System.out.println(h + " " + w + " " + (u/d));
					return;
				}
			}
		}
	}
	public static void main(String[] args) throws Exception{
		new Main().solve();
	}
}