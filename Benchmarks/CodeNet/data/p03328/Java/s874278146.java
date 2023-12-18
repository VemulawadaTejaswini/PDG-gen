import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int diffHeightA = sc.nextInt();
		int diffHeightB = sc.nextInt();

		int intTowerHeightA = 0;
		int intTowerHeightB = 0;

		for(int i = 1; intTowerHeightB < diffHeightB; i++) {

			if(intTowerHeightA < diffHeightA) {
				intTowerHeightA += i;
			}

			intTowerHeightB += i;
		}

		boolean isOkFlag = true;
		int intSnowHeight = 1;
		int checkNum1 = 0;
		int checkNum2 = 0;
		while(isOkFlag) {
			if((intTowerHeightA - intSnowHeight) == diffHeightA) {
				isOkFlag = false;
			}
			else {
				intSnowHeight++;
			}
		}
		System.out.println(intSnowHeight);
	}
}