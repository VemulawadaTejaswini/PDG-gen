import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		int n = in.nextInt();
		char[][] field = new char[w][h];
		String line;
		for (int i = 0; i < h; i++) {
			line = in.next();
			for (int j = 0; j < w; j++) {
				field[j][h - i - 1] = line.charAt(j);
			}
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w - 1; j++) {
				char[][] f = new char[w][h];
				for(int k=0;k<h;k++){
					for(int l=0;l<w;l++){
						f[l][k] = field[l][k];
					}
				}
				if (f[j][i] == '.' || f[j + 1][i] == '.')
					continue;
				char t = f[j][i];
				f[j][i] = f[j + 1][i];
				f[j + 1][i] = t;

				while (true) {
					// judge dis
					boolean[][] dis = new boolean[w][h];
					boolean disap = false;
					for (int k = 0; k < w; k++) {
						char now;
						for (int l = 0; l < h;l++) {
							int count = 1;
							now = f[k][l];
							if (now == '.')
								break;
							while (l + count < h && f[k][l + count] == now) {
								count++;
							}
							if (count >= n) {
								for (int m = 0; m < count; m++) {
									dis[k][l + m] = true;
								}
								disap = true;
							}
							l += count-1;
						}
					}

					for (int l = 0; l < h; l++) {
						char now;
						for (int k = 0; k < w; k++) {
							int count = 1;
							now = f[k][l];
							if(now=='.') continue;
							while (k + count < w && f[k + count][l] == now) {
								count++;
							}
							if (count >= n) {
								for (int m = 0; m < count; m++) {
									dis[k + m][l] = true;
								}
								disap = true;
							}
							k += count-1;
						}
					}

					if (!disap)
						break;

					char[][] next = new char[w][h];
					boolean clear = true;
					for (int k = 0; k < w; k++) {
						int bot = 0;
						int top = h - 1;
						for (int l = 0; l < h; l++) {
							if (f[k][l] != '.' && !dis[k][l]) {
								next[k][bot] = f[k][l];
								bot++;
							} else {
								next[k][top] = '.';
								top--;
							}
						}
						if (bot != 0)
							clear = false;
					}
					if(clear){
						System.out.println("YES");
						return;
					}
					f = next;
				}
			}
		}
		System.out.println("NO");
	}
}