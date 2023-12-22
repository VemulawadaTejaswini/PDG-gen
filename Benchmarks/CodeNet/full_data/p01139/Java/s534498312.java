import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int w = sc.nextInt();
			final int h = sc.nextInt();

			if (w == 0 && h == 0) {
				break;
			}

			int[][] map = new int[h][w];

			for (int i = 0; i < h; i++) {
				char[] input = sc.next().toCharArray();

				for (int j = 0; j < w; j++) {
					if (input[j] == 'W') {
						map[i][j] = 1;
					} else if (input[j] == 'B') {
						map[i][j] = -1;
					} else {
						map[i][j] = 0;
					}
				}
			}

			int[][] w_dist = new int[h][w];
			int[][] b_dist = new int[h][w];

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					w_dist[i][j] = Integer.MAX_VALUE;
					b_dist[i][j] = Integer.MAX_VALUE;
				}
			}

			while(true){
				boolean updated = false;
				
				// w-forward
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						if (map[i][j] == -1) {
							w_dist[i][j] = Integer.MAX_VALUE;
							continue;
						} else if (map[i][j] == 1) {
							w_dist[i][j] = 0;
							continue;
						}
						
						int cur = w_dist[i][j];

						if (i == 0 && j == 0) {
							w_dist[i][j] = Math.min(Integer.MAX_VALUE, w_dist[i][j]);
						} else if (i == 0) {
							if (w_dist[i][j - 1] != Integer.MAX_VALUE) {
								w_dist[i][j] = Math.min(w_dist[i][j - 1] + 1, w_dist[i][j]);
							} else {
								w_dist[i][j] = Math.min(w_dist[i][j - 1], w_dist[i][j]);
							}
						} else if (j == 0) {
							if (w_dist[i - 1][j] != Integer.MAX_VALUE) {
								w_dist[i][j] = Math.min(w_dist[i - 1][j] + 1, w_dist[i][j]);
							} else {
								w_dist[i][j] = Math.min(w_dist[i - 1][j], w_dist[i][j]);
							}
						} else {
							final int min = Math.min(w_dist[i - 1][j],
									w_dist[i][j - 1]);
							if (min != Integer.MAX_VALUE) {
								w_dist[i][j] = Math.min(min + 1, w_dist[i][j]);
							} else {
								w_dist[i][j] = Math.min(min, w_dist[i][j]);
							}
						}
						
						if(w_dist[i][j] != cur){
							updated = true;
						}
					}
				}
				// w-back
				for (int i = h - 1; i >= 0; i--) {
					for (int j = w - 1; j >= 0; j--) {
						if (map[i][j] == -1) {
							w_dist[i][j] = Integer.MAX_VALUE;
							continue;
						} else if (map[i][j] == 1) {
							w_dist[i][j] = 0;
							continue;
						}
						
						int cur = w_dist[i][j];

						if (i == h - 1 && j == w - 1) {
							w_dist[i][j] = Math.min(Integer.MAX_VALUE,
									w_dist[i][j]);
						} else if (i == h - 1) {
							if (w_dist[i][j + 1] != Integer.MAX_VALUE) {
								w_dist[i][j] = Math.min(w_dist[i][j + 1] + 1,
										w_dist[i][j]);
							} else {
								w_dist[i][j] = Math.min(w_dist[i][j + 1],
										w_dist[i][j]);
							}
						} else if (j == w - 1) {
							if (w_dist[i + 1][j] != Integer.MAX_VALUE) {
								w_dist[i][j] = Math.min(w_dist[i + 1][j] + 1,
										w_dist[i][j]);
							} else {
								w_dist[i][j] = Math.min(w_dist[i + 1][j],
										w_dist[i][j]);
							}
						} else {
							final int min = Math.min(w_dist[i + 1][j],
									w_dist[i][j + 1]);
							if (min != Integer.MAX_VALUE) {
								w_dist[i][j] = Math.min(min + 1, w_dist[i][j]);
							} else {
								w_dist[i][j] = Math.min(min, w_dist[i][j]);
							}
						}
						
						if(w_dist[i][j] != cur){
							updated = true;
						}
					}
				}

				// b-forward
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						if (map[i][j] == 1) {
							b_dist[i][j] = Integer.MAX_VALUE;
							continue;
						} else if (map[i][j] == -1) {
							b_dist[i][j] = 0;
							continue;
						}
						
						int cur = b_dist[i][j];
						
						if (i == 0 && j == 0) {
							b_dist[i][j] = Math.min(Integer.MAX_VALUE, b_dist[i][j]);
						} else if (i == 0) {
							if (b_dist[i][j - 1] != Integer.MAX_VALUE) {
								b_dist[i][j] = Math.min(b_dist[i][j - 1] + 1, b_dist[i][j]);
							} else {
								b_dist[i][j] = Math.min(b_dist[i][j - 1], b_dist[i][j]);
							}
						} else if (j == 0) {
							if (b_dist[i - 1][j] != Integer.MAX_VALUE) {
								b_dist[i][j] = Math.min(b_dist[i - 1][j] + 1, b_dist[i][j]);
							} else {
								b_dist[i][j] = Math.min(b_dist[i - 1][j], b_dist[i][j]);
							}
						} else {
							final int min = Math.min(b_dist[i - 1][j],
									b_dist[i][j - 1]);
							if (min != Integer.MAX_VALUE) {
								b_dist[i][j] = Math.min(min + 1, b_dist[i][j]);
							} else {
								b_dist[i][j] = Math.min(min, b_dist[i][j]);
							}
						}
						
						if(b_dist[i][j] != cur){
							updated = true;
						}
					}
				}

				// b-back
				for (int i = h - 1; i >= 0; i--) {
					for (int j = w - 1; j >= 0; j--) {
						if (map[i][j] == 1) {
							b_dist[i][j] = Integer.MAX_VALUE;
							continue;
						} else if (map[i][j] == -1) {
							b_dist[i][j] = 0;
							continue;
						}
						
						int cur = b_dist[i][j];

						if (i == h - 1 && j == w - 1) {
							b_dist[i][j] = Math.min(Integer.MAX_VALUE,
									b_dist[i][j]);
						} else if (i == h - 1) {
							if (b_dist[i][j + 1] != Integer.MAX_VALUE) {
								b_dist[i][j] = Math.min(b_dist[i][j + 1] + 1,
										b_dist[i][j]);
							} else {
								b_dist[i][j] = Math.min(b_dist[i][j + 1],
										b_dist[i][j]);
							}
						} else if (j == w - 1) {
							if (b_dist[i + 1][j] != Integer.MAX_VALUE) {
								b_dist[i][j] = Math.min(b_dist[i + 1][j] + 1,
										b_dist[i][j]);
							} else {
								b_dist[i][j] = Math.min(b_dist[i + 1][j],
										b_dist[i][j]);
							}
						} else {
							final int min = Math.min(b_dist[i + 1][j],
									b_dist[i][j + 1]);
							if (min != Integer.MAX_VALUE) {
								b_dist[i][j] = Math.min(min + 1, b_dist[i][j]);
							} else {
								b_dist[i][j] = Math.min(min, b_dist[i][j]);
							}
						}
						
						if(b_dist[i][j] != cur){
							updated = true;
						}
					}
				}
				
				if(!updated){
					break;
				}
			}

			int b_count = 0;
			int w_count = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					final int w_d = w_dist[i][j] == Integer.MAX_VALUE ? Integer.MIN_VALUE
							: w_dist[i][j];
					final int b_d = b_dist[i][j] == Integer.MAX_VALUE ? Integer.MIN_VALUE
							: b_dist[i][j];

					if (w_d > 0 && b_d > 0) {
						continue;
					} else if (w_d > 0) {
						w_count++;
					} else if (b_d > 0) {
						b_count++;
					}
				}
			}

			System.out.println(b_count + " " + w_count);
		}
	}

}