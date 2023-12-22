import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj2102/input.txt"));
//			System.setOut(new PrintStream(new FileOutputStream("src/aoj2101/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}



	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			int[] num = new int[9];
			String colors = "RGB";

			int[][] hand = new int[3][9];
			for (int i = 0; i < 9; i++) num[i] = sc.nextInt();
			for (int i = 0; i < 9; i++) {
				String coler = sc.next();
				int idx = colors.indexOf(coler.charAt(0));
				hand[idx][num[i]]++;
			}

			int done = 0;
			for (int coler = 0; coler < 3; coler++) {
				for (int i = 0; i < 9; i++) while (hand[coler][i] >= 3){
					hand[coler][i] -= 3;
					done += 3;
				}
				for (int i = 0; i + 3 < 9; i++) while (hand[coler][i] > 0 && hand[coler][i+1] > 0 && hand[coler][i+2] > 0) {
					hand[coler][i]--; hand[coler][i+1]--; hand[coler][i+2]--;
					done += 3;
				}
			}
			System.out.println(done == 9 ? 1 : 0);
		}
	}


	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
}