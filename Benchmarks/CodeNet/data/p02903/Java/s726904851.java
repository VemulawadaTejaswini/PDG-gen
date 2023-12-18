import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] c = new int[h][w];

		for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				System.out.print(0);
			}
			for(int j = a; j < w; j++) {
				System.out.print(1);
			}
			System.out.printf("%n");
		}
		for(int i = b; i < h; i++) {
			for(int j = 0; j < a; j++) {
				System.out.print(1);
			}
			for(int j = a; j < w; j++) {
				System.out.print(0);
			}
			System.out.printf("%n");
		}

		/*for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				c[i][j] = 0;
			}
			for(int j = a; j < w; j++) {
				c[i][j] = 1;
			}
		}
		for(int i = b; i < h; i++) {
			for(int j = 0; j < a; j++) {
				c[i][j] = 1;
			}
			for(int j = a; j < w; j++) {
				c[i][j] = 0;
			}
		}

		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print(c[i][j]);
			}
			System.out.printf("%n");
		}*/

		sc.close();
	}

}