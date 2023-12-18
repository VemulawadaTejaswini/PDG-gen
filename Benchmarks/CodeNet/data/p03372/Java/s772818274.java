import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		long c = Long.parseLong(arr[1]);
		long[] x = new long[n];
		long[] v = new long[n];
		for(int i=0 ;i<n; i++) {
			arr = sc.nextLine().split(" ");
			x[i] = Long.parseLong(arr[0]);
			v[i] = Long.parseLong(arr[1]);
		}
		sc.close();

		// table作成
		long[][] tokeiTable = new long[3][n+1];
		long[][] hanTokeiTable = new long[3][n+1];

		for(int i=0; i<3; i++)
			Arrays.fill(tokeiTable[i], 0);
		for(int i=1; i<n+1; i++) {
			tokeiTable[0][i] = tokeiTable[0][i-1] + v[i-1];
			tokeiTable[1][i] = x[i-1];
			tokeiTable[2][i] = tokeiTable[0][i] - tokeiTable[1][i];
		}
		for(int i=0; i<3; i++) {
			Arrays.fill(hanTokeiTable[i], 0);
		}
		for(int i=n-1; i>=0; i--) {
			hanTokeiTable[0][i] = hanTokeiTable[0][i+1] + v[i];
			hanTokeiTable[1][i] = c - x[i];
			hanTokeiTable[2][i] = hanTokeiTable[0][i] - hanTokeiTable[1][i];
		}
/*
		for(int i=0; i<3; i++) {
			for(int j=0; j<n+1; j++) {
				System.out.print(tokeiTable[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			for (int j=0; j<n+1; j++) {
				System.out.print(hanTokeiTable[i][j]+"\t");
			}
			System.out.println();
		}
*/
		// 計算
		long max = tokeiTable[2][0];
		for(int i=1; i<n+1; i++) {
			int tokeiMaxIndex = i;
			// hantokei計算
			int hanTokeiMaxIndex = i;
			for(int j=i+1; j<n+1; j++) {
				if(hanTokeiTable[2][hanTokeiMaxIndex]<hanTokeiTable[2][j]) {
					hanTokeiMaxIndex = j;
				}
			}
			long total = tokeiTable[2][tokeiMaxIndex] + hanTokeiTable[2][hanTokeiMaxIndex]
					- (tokeiTable[1][tokeiMaxIndex] < hanTokeiTable[1][hanTokeiMaxIndex] ? tokeiTable[1][tokeiMaxIndex] : hanTokeiTable[1][hanTokeiMaxIndex]);
			if(max<total) {
				max = total;
			}
		}

		System.out.println(max);
	}
}
