import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][][] info = new int[4][3][10];

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					info[i][j][k] = 0;
				}
			}
		}
		
		for(int i = 0; i < n; i++){
			int tower = scanner.nextInt();
			int f = scanner.nextInt();
			int room = scanner.nextInt();
			int member = scanner.nextInt();

			info[tower-1][f-1][room-1] += member;
		}

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k <= 9; k++){
					System.out.print(" " + info[i][j][k]);
				}
				System.out.print("\n");
			}
			if(i < 3){
			System.out.println("####################");
			}
		}
	}

}