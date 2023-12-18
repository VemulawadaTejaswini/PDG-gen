import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		// a0とa1とa2を固定
		for(int i = 0 ; i <= 100 ; i++) {
			for(int j = 0 ; j <= 100 ; j++) {
				for(int k = 0 ; k <= 100 ; k++) {
					if(i + j + k > 100) continue;
					int b0 = a[0][0] - i;
					int b1 = a[0][1] - i;
					int b2 = a[0][2] - i;
					if(0 <= b0 && b0 <= 100 && 0 <= b1 && b1 <= 100 && 0 <= b2 && b2 <= 100) {
						if(j + b1 == a[1][1] && j + b2 == a[1][2] && k + b1 == a[2][1] && k + b2 == a[2][2]) {
							System.out.println("Yes");
							return;
						}
					}
				}
			}
		}
		System.out.println("No");
	}
}
