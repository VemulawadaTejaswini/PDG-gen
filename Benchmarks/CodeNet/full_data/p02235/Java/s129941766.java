import java.util.*;

public class Main {
	
	int findLCS(char[] X, char[] Y, int lenX, int lenY) {
		int[][] chart = new int[lenX+1][lenY+1];
		for(int i = 0; i <= lenX; i++) {
			for(int j = 0; j <= lenY; j++) {
				if(i == 0 || j == 0) {
					chart[i][j] = 0;
				}
				else if (X[i-1] == Y[j-1]) {
					chart[i][j] = chart[i-1][j-1] + 1;
				}else {
					chart[i][j] = higherOfTwo(chart[i-1][j], chart[i][j-1]);
				}
			}
		}
		return chart[lenX][lenY];
	}
	int higherOfTwo(int top, int left) {
		return (top > left)? top : left; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int q = input.nextInt();
		Main test = new Main();
		input.nextLine();
		for(int i = 0 ; i < q; i++) {
			String str1 = input.nextLine();
			String str2 = input.nextLine();
			char[] X = str1.toCharArray();
			char[] Y = str2.toCharArray();
			int lenX = X.length;
			//System.out.println(lenX);
			int lenY = Y.length;
			//System.out.println(lenY);
			int ans = test.findLCS(X, Y, lenX, lenY);
			System.out.println(ans);
		}
		input.close();	
	}
}
