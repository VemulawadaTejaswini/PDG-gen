
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] arrayInput = new  int[r][c];

		int x = r+1;
		int y = c+1;

		int[][] arrayOutput = new  int[x][y];


		//?????????????????\???????????????
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				arrayInput[i][j] = sc.nextInt();
			}
		}


		//??????????¨?????±???????
		int Sum = 0;
		int Num = 0;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {

				if(!(i+1 == x) && !( j+1 == y )) {
					arrayOutput[i][j] = arrayInput[i][j];
				}

				else if(j+1 == y) {
					for(int k=0; k < y-1; k++) {
						Num = arrayOutput[i][k];
						Sum = Sum + Num;
					}
					arrayOutput[i][j] = Sum;
					Num = 0;
					Sum = 0;
				}
			}
		}

		//??????????¨?????±???????
				int Sum1 = 0;
				int Num1 = 0;
				for(int j = 0; j < y; j++) {
					for(int i = 0; i < x; i++) {

						if(i+1 == x) {
							for(int k=0; k < x-1; k++) {
								Num1 = arrayOutput[k][j];
								Sum1 = Sum1 + Num1;
							}
							arrayOutput[i][j] = Sum1;
							Num1 = 0;
							Sum1 = 0;
						}
					}
				}

		//?????????????????????
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {

				if(j+1 == y) {
					System.out.print(arrayOutput[i][j]);
				}
				else {
					System.out.print(arrayOutput[i][j]+" ");
				}

			}
			System.out.println("");
		}


	}
}