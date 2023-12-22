import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][][] room = new int[4][3][10];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++) {
			room[sc.nextInt()][sc.nextInt()][sc.nextInt()] = sc.nextInt();
		}
		
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<3;j++) {
				for(int k = 0;k<10;j++) {
					System.out.println(room[i][j][k]);
				}
			}
			System.out.println("####################");
		}
	}
}

