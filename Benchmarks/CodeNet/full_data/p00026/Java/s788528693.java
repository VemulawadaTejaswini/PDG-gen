import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0026/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/xxxyyyy/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		

		int [][] table = new int[10][10];
		while(sc.hasNext()) {
			String []ss = sc.next().split(",");
			int col = Integer.parseInt(ss[0]);
			int row = Integer.parseInt(ss[1]);
			int z = Integer.parseInt(ss[2]);
			
			for(int dr = -2; dr <= 2; dr++) 
				for(int dc = -2; dc <= 2; dc++) {
					int nr = row + dr;
					int nc = col + dc;
					if( valid(nr, nc)) {
						if (z == 1) {
							if (abs(dr) + abs(dc) <= 1)
								table[nr][nc]++;
						}
						if (z == 2) {
							if (max(abs(dr), abs(dc)) <= 1)
								table[nr][nc]++;
						}
						if (z == 3) {
							if (abs(dr) + abs(dc) <= 2)
								table[nr][nc]++;
						}
					}
				}
			
		}
		int white = 0;
		int max = 0;
		for(int i = 0; i < 10; i++)
			for(int j = 0; j < 10; j++) {
				max = max(max, table[i][j]);
				if( table[i][j] == 0 ) white++;
			}
		System.out.println(white);
		System.out.println(max);
	}
	
	boolean valid(int r, int c) {
		return 0 <= r && r < 10 && 0 <= c && c < 10;
	}
	
	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
}