import java.util.Scanner;

class Wall {

}

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		int width = scan.nextInt();
		int c[][] = new int[10][10];
		int a[][] = new int[height][width];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				c[i][j] = scan.nextInt();
			}
		}
		for (int k = 0; k < 10; k++) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (c[i][j] > c[i][k] + c[k][j]) {
						c[i][j] = c[i][k] + c[k][j];
					}
				}
			}
		}
		int totalCost=0;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				a[i][j] = scan.nextInt();
				if(a[i][j]!=-1) {
					totalCost+=c[a[i][j]][1];
				}
			}
		}
		System.out.println(totalCost);
	}
}