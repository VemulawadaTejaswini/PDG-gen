import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] a = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int n = 0;
		List<String> list = new ArrayList<>();
		for(int i = 0; i < h; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < w; j++) {
//					System.out.println(i + " " + j);
					if(a[i][j] % 2 == 1) {
						if(i == h - 1 && j == w - 1) break;
						n++;
						a[i][j]--;
						if(j == w - 1) {
							a[i + 1][j]++;
							list.add(i + " " + j + " " + (i + 1) + " " + j);
						} else {
							a[i][j + 1]++;
							list.add(i + " " + j + " " + i + " " + (j + 1));
						}
					}
				}
			} else {
				for(int j = w - 1; j >= 0; j--) {
//					System.out.println(i + " " + j);
					if(a[i][j] % 2 == 1) {
						if(i == h - 1 && j == 0) break;
						n++;
						a[i][j]--;
						if(j == 0) {
							a[i + 1][j]++;
							list.add(i + " " + j + " " + (i + 1) + " " + j);
						} else {
							a[i][j - 1]++;
							list.add(i + " " + j + " " + i + " " + (j - 1));
						}
					}
				}
			}
		}
		System.out.println(n);
		for(String key : list) {
			System.out.println(key);
		}
	}
}
