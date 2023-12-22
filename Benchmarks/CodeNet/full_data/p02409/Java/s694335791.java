import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][][][] data = new int[4][3][10][1];

		for (int i = 0; i < a; i++) {
			int building = sc.nextInt();
			int floor = sc.nextInt();
			int room = sc.nextInt();
			int person = sc.nextInt();
			data[building-1][floor-1][room-1][0] += person;
		}

		for (int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					System.out.print(" " + data[i][j][k][0]);
				}
				System.out.println();
			}
			if(i != 3)
			System.out.println("####################");
		}
	}

}