import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] a = new int[3][3];

		for(int i = 0;i<3;i++) {
			for(int j= 0;j<3;j++) {

				a[i][j] = scan.nextInt();
			}
		}

		int n = scan.nextInt();
		int[] b = new int[n];
		int[][] check = new int[3][3];

		for(int k=0;k<n;k++) {
			b[k] = scan.nextInt();

			for(int i = 0;i<3;i++) {
				for(int j=0;j<3;j++) {

					if(b[k] == a[i][j]) {
						check[i][j] = 1;
					}
				}
			}
		}

		boolean re = false;

		for(int i=0;i<3;i++) {
			int checkSum = 0;
			for(int j=0;j<3;j++) {
				checkSum += check[i][j];
			}
			if(checkSum == 3) {
				re =true;
			}
		}

		for(int i=0;i<3;i++) {
			int checkSum = 0;
			for(int j=0;j<3;j++) {
				checkSum += check[j][i];
			}
			if(checkSum == 3) {
				re = true;
			}
		}


		int checkSum = 0;
		for(int j=0;j<3;j++) {

			checkSum += check[j][j];
		}
		if(checkSum == 3) {
			re = true;
	}

		checkSum = 0;
		for(int j=0;j<3;j++) {

			checkSum += check[j][j-2];
		}
			if(checkSum == 3) {
				re =true;
		}

		System.out.println(re? "Yes":"No");
		scan.close();
	}

}
