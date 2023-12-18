import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int n = scan.nextInt();
		int i = 0;
		int j = 0;
		int k = 0;
		int[][] c = new int[w][h];
		for(i = 0; i < w; i++) {
			for(j = 0; j < h; j++) {
				c[i][j] = 1;
			}
		}
		for(i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int a = scan.nextInt();
			if(a == 1) {
				for(j = 0; j < x; j++) {
					for(k = 0; k < h; k++) {
						c[j][k] = 0;
					}
				}
			} else if(a == 2) {
				for(j = x; j < w; j++) {
					for(k = 0; k < h; k++) {
						c[j][k] = 0;
					}
				}
			} else if(a == 3) {
				for(j = 0; j < w; j++) {
					for(k = 0; k < y; k++) {
						c[j][k] = 0;
					}
				}
			} else if(a == 4) {
				for(j = 0; j < w; j++) {
					for(k = y; k < h; k++) {
						c[j][k] = 0;
					}
				}
			}
		}
		int count = 0;
		for(i = 0; i < w; i++) {
			for(j = 0; j < h; j++) {
				count = count + c[i][j];
			}
		}
		System.out.println(count);
	}
}