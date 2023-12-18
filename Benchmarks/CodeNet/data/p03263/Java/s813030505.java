import java.util.*;
import java.io.*;

class Main {
    public static void main(String... args) {
        int H = IN.nextInt();
		int W = IN.nextInt();
		boolean[][] G = new boolean[H + 1][W + 1];
		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				G[i][j] = IN.nextInt() % 2 == 1;
			}
		}

		List<String> log = new ArrayList<>();
        for (int i = 1; i < H; i++) {
			for (int j = 0; j <= W; j++) {
                if (G[i][j]) {
					G[i + 1][j] = !G[i + 1][j];
					log.add(i + " " + j + " " + (i + 1) + " " + j);
				}
			}
		}

		for (int j = 1; j < W; j++) {
			if (G[H][j]) {
				G[H][j + 1] = !G[H][j + 1];
				log.add(H + " " + j + " " + H + " " + (j + 1));
			}
		}
        puts(log.size());
		for (String line: log) {
			puts(line);
		}
		flush();
	}
    static final Scanner IN = new Scanner(System.in);
	static final PrintWriter OUT = new PrintWriter(System.out);
	static <T> void puts(T arg) { OUT.println(arg); }
	static void flush() { OUT.flush(); }
}
