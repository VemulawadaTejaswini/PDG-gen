import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] a = new int[H + 1][W + 1];
		
		for(int i = 1; i < (H + 1); i++) {
			for(int j = 1; j < (W + 1); j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 1; i < (H + 1); i++) {
			for(int j = 1; j < (W + 1); j++) {
				if((a[i][j] % 2 != 0) && (j != W)) {
					a[i][j] -= 1;
					a[i][j + 1] += 1;
					int b = j + 1;
					System.out.println(i + " " + j + " " + i + " " + b);
				} else if((a[i][j] % 2 != 0) && (j == W)) {
					a[i][j] -= 1;
					a[i + 1][j] += 1;
					int c = i + 1;
					System.out.println(i + " " + j + " " + i + " " + c);
				} 
			}
		}
	}
}
