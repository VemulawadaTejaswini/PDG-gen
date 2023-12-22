import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[][] house = new int[4][30];

		for(int i = 0;i < house.length; i ++) {
			for(int j = 0;j < house[i].length; j++){
				house[i][j] = 0;
			}

		}

		for(int i = 0;i < count;i++) {
			int houseNum = sc.nextInt();
			int roomNum = Integer.parseInt(sc.next() + sc.next()) - 10;
			int member = sc.nextInt();
			house[houseNum - 1][roomNum - 1] += member;

		}

		for(int i = 0;i < house.length;i++) {
			for(int j = 0;j < house[i].length;j++) {
				if(j != 0 && j % 10 == 0) {
					System.out.println();
				}
				System.out.print(house[i][j]);

			}
			System.out.println();
			for(int j = 0;j < 10 ;j++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}
}