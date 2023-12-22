import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfPlayer = sc.nextInt();
		int number[][] = new int [numberOfPlayer][3];
		int point [] = new int [numberOfPlayer];
		
		for (int i = 0; i < numberOfPlayer; i++) {
			for (int j = 0; j < 3; j++) {
				number[i][j] = sc.nextInt();
			}
			point[i] = 0;
		}
		
		for (int p = 0; p < 3; p++) {
			for (int q = 0; q < numberOfPlayer; q++) {
				boolean flag = false;
				for (int l = 0; l < numberOfPlayer; l++) {
					if (q != l && number[q][p] == number[l][p]) {
						flag = true;
					}
				}
				if (!flag) {
					point[q] += number[q][p];
				}
			}
		}
		
		for (int i = 0; i < numberOfPlayer; i++) {
			System.out.println(point[i]);
		}

	}

}