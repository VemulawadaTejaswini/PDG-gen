import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();

		int rc[][] = new int[r+1][c+1];


		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				rc[i][j] = sc.nextInt();
				rc[i][c] += rc[i][j];
				rc[r][c] += rc[i][j];
			}
		}

		for(int i=0; i<c; i++) {
			for(int j=0; j<r; j++) {
				rc[r][i] += rc[j][i];
			}
		}


		for(int i=0; i<r+1; i++) {
			for(int j=0; j<c+1; j++) {
				if(j != 0) System.out.print(" ");
				System.out.print(rc[i][j]);
			}
			System.out.println();
		}
	}

}

