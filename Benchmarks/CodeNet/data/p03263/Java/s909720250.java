import java.util.*;

class Main {
    public static void main(String... args) {
        int H = IN.nextInt();
		int W = IN.nextInt();
		int[][] G = new int[H][W + 1];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				G[i][j] = IN.nextInt() % 2;
			}
		}
	//	puts(Arrays.deepToString(G));
		List<int[]> log = new ArrayList<>();
        for (int i = 0; i < H - 1; i++) {
			for (int j = 0; j < W; j++) {
                if (G[i][j] == 1) {
					if (G[i][j + 1] == 1) {
						G[i][j + 1] = 0;
						log.add(createL(i, j, i, j + 1));
					} else {
						if (G[i + 1][j] == 1) {
						    G[i + 1][j] = 0;
					    } else {
						    G[i + 1][j] = 1;
						}
					    log.add(createL(i, j, i + 1, j));
					}
				}
			}
		}
		for (int j = 0; j < W - 1; j++) {
			if (G[H - 1][j] == 1) {
				if (G[H - 1][j + 1] == 1) {
					G[H - 1][j + 1] = 0;
				} else {
					G[H - 1][j + 1] = 1;
				}
				log.add(createL(H - 1, j, H - 1, j + 1));
			}
		}
        puts(log.size());
		for (int[] x: log) {
			puts(join(x, " "));
		}

	}
    static int[] createL(int a, int b, int c, int d) {
		int[] x = {a + 1, b + 1, c + 1, d + 1};
		return x;
	}


	static String join(int[] a, String s) {
		StringBuilder v = new StringBuilder();
		for (int i = 0; i < a.length - 1; i ++) {
			v.append(a[i]);
			v.append(s);
		}
		return v.append(a[a.length - 1]).toString();
	}
    static final Scanner IN = new Scanner(System.in);
    static <T> void puts(T arg) { System.out.println(arg); }
}

