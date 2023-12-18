import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] bingo = new int[3][3];

		for(int i = 0; i < 3; i++ ) {
			for(int j = 0; j < 3; j++) {
				bingo[i][j] = sc.nextInt();
			}
		}

		int counter = sc.nextInt();

		int[] dataout = new int[counter];
		for(int k = 0; k < counter; k++) {
			dataout[k] = sc.nextInt();
		}

		int[] check = new int[9];
		int data_i = 0;
		for(int i = 0; i < 3; i++ ) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < counter; k++) {
					check[data_i] = 0;
					if(bingo[i][j] == dataout[k]) {
						check[data_i] = bingo[i][j];
						break;
					}
				}
				data_i++;
			}
		}

		String print = "No";

		if((check[0] != 0 && check[1] != 0 && check[2] != 0) ||
			(check[0] != 0 && check[3] != 0 && check[6] != 0) ||
			(check[0] != 0 && check[4] != 0 && check[8] != 0) ||
			(check[1] != 0 && check[4] != 0 && check[7] != 0) ||
			(check[2] != 0 && check[4] != 0 && check[6] != 0) ||
			(check[2] != 0 && check[5] != 0 && check[8] != 0) ||
			(check[3] != 0 && check[4] != 0 && check[5] != 0) ||
			(check[6] != 0 && check[7] != 0 && check[8] != 0)) {
				print = "Yes";
		}
//		System.out.println(Arrays.toString(check));

		System.out.println(print);
		sc.close();
	}
}
