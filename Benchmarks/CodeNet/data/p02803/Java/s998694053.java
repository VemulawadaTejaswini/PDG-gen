
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] dist = new int[h * w][h * w];
		int road = 1000;
		int inf = 5000;
		String[] s = new String[h];
		for(int i = 0; i < h; i++) {
			s[i] = sc.next();
		}
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				for(int k = 0; k < h; k++) {
					for(int l = 0; l < w; l++) {
						if(s[i].charAt(j) == '.' && s[k].charAt(l) == '.') {
							if(i == k && j == l) {
								dist[i * w + j][k * w + l] = 0;
								dist[k * w + l][i * w + j] = 0;
							} else {
								dist[i * w + j][k * w + l] = road;
								dist[k * w + l][i * w + j] = road;
							}
						} else {
							dist[i * w + j][k * w + l] = inf;
							dist[k * w + l][i * w + j] = inf;
						}
					}
				}
			}
		}
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(i != 0 && s[i - 1].charAt(j) == '.' && s[i].charAt(j) == '.') {
					dist[i * w + j][(i - 1) * w + j] = 1;
					dist[(i - 1) * w + j][i * w + j] = 1;
				}
				if(i != h - 1 && s[i + 1].charAt(j) == '.' && s[i].charAt(j) == '.') {
					dist[i * w + j][(i + 1) * w + j] = 1;
					dist[(i + 1) * w + j][i * w + j] = 1;
				}
				if(j != 0 && s[i].charAt(j - 1) == '.' && s[i].charAt(j) == '.') {
					dist[i * w + j][i * w + j - 1] = 1;
					dist[i * w + j - 1][i * w + j] = 1;
				}
				if(j != w - 1 && s[i].charAt(j + 1) == '.' && s[i].charAt(j) == '.') {
					dist[i * w + j][i * w + j + 1] = 1;
					dist[i * w + j + 1][i * w + j] = 1;
				}
			}
		}
		for(int k = 0; k < h * w; k++) {
			for(int i = 0; i < h * w; i++) {
				for(int j = 0; j < h * w; j++) {
					if(dist[i][k] + dist[k][j] < dist[i][j] && dist[i][j] != inf) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}

		int ans = 0;
		for(int i = 0; i < h * w; i++) {
			for(int j = 0; j < h * w; j++) {
				if(dist[i][j] != inf)
					ans = Math.max(ans, dist[i][j]);
			}
		}
		System.out.println(ans);

	}

}
