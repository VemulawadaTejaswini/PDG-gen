import java. util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int[][][] bingo = new int[3][3][2];

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				bingo[i][j][0] = scan.nextInt();
			}
		}

		int n = scan.nextInt();
		int[] b = new int[n];

		for(int i=0;i<n;i++) {
			b[i] = scan.nextInt();
		}

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<n;k++) {
					if(b[k]==bingo[i][j][0]) {
						bingo[i][j][1] = 1;
					}
				}
			}
		}

		isSameI(bingo);
		isSameJ(bingo);
		isSameR(bingo);
		isSameL(bingo);

		if(isSameI(bingo)||isSameJ(bingo)||isSameR(bingo)||isSameL(bingo)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}



	}

	public static boolean isSameI(int[][][] b) {
		boolean result = false;
		for(int i=0;i<3;i++) {
			if(b[i][0][1]==1&&b[i][1][1]==1&&b[i][2][1]==1) {
				result = true;
			}
		}
		return result;
	}

	public static boolean isSameJ(int[][][] b) {
		boolean result = false;
		for(int i=0;i<3;i++) {
			if(b[0][i][1]==1&&b[1][i][1]==1&&b[2][i][1]==1) {
				result = true;
			}
		}
		return result;
	}


	public static boolean isSameR(int[][][] b) {
		boolean result = false;
		if(b[0][0][1]==1&&b[1][1][1]==1&&b[2][2][1]==1) {
			result = true;
		}
		return result;
	}

	public static boolean isSameL(int[][][] b) {
		boolean result = false;
		if(b[0][2][1]==1&&b[1][1][1]==1&&b[2][0][1]==1) {
			result = true;
		}
		return result;
	}

}
