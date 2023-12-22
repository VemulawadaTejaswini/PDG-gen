import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day, numberOfTypes, bestShowy = 0;
		
		day = sc.nextInt();
		numberOfTypes = sc.nextInt();
		
		int temperature [] = new int [day];
		int clothesInfo [][] = new int [numberOfTypes][3];
		
		for (int i = 0; i < day; i++) {
			temperature[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numberOfTypes; i++) {
			for (int j = 0; j < 3; j++) {
				clothesInfo[i][j] = sc.nextInt();
			}
		}

		int showy[][] = new int [day][numberOfTypes];
		
		for (int i = 0; i < day; i++) {
			for (int j = 0; j < numberOfTypes; j++) {
				if (clothesInfo[j][0] <= temperature[i] && clothesInfo[j][1] >= temperature[i]) {
					showy[i][j] = 0;
				}else {
					showy[i][j] = -1;
				}
			}
		}
		
		for (int i = 1; i < day; i++) {
			for (int j = 0; j < numberOfTypes; j++) {
				if (showy[i][j] == 0) {
					for (int k = 0; k < numberOfTypes; k++) {
						if (showy[i - 1][k] != -1) {
							showy[i][j] = Math.max(showy[i][j], showy[i - 1][k] + Math.abs(clothesInfo[k][2] - clothesInfo[j][2]));
						}
					}
				}
			}
		}

		for (int p = 0; p < numberOfTypes; p++) {
			bestShowy = Math.max(bestShowy, showy[day - 1][p]);
		}
		
		System.out.println(bestShowy);
	}
	
}