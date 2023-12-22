import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] atower = new int[3][10];
		int[][] btower = new int[3][10];
		int[][] ctower = new int[3][10];
		int[][] dtower = new int[3][10];
		
		for (int i = 0; i < n; i++) {
			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int v = scan.nextInt();
			
			if (b == 1) {
				atower[f-1][r-1] += v;
			}
			else if (b == 2) {
				btower[f-1][r-1] += v;
			}
			else if (b == 3) {
				ctower[f-1][r-1] += v;
			}
			else if (b == 4) {
				dtower[f-1][r-1] += v;
			}
		}
		for (int k = 0; k < 3; k++) {
			for (int m = 0; m < 10; m++) {
				System.out.print(" " + atower[k][m]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for (int k = 0; k < 3; k++) {
			for (int m = 0; m < 10; m++) {
				System.out.print(" " + btower[k][m]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for (int k = 0; k < 3; k++) {
			for (int m = 0; m < 10; m++) {
				System.out.print(" " + ctower[k][m]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for (int k = 0; k < 3; k++) {
			for (int m = 0; m < 10; m++) {
				System.out.print(" " + dtower[k][m]);
			}
			System.out.println();
		}
	}
}
