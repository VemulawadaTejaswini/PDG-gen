import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0;i < n;i++) {
			h[i] = sc.nextInt();
		}
		int[][] ab = new int[m][2];
		int[] result = new int[n];
		for(int i = 0;i < n;i++) {
			result[i] = 0;
		}

		for(int i = 0;i < m;i++) {

			for(int j = 0;j < 2;j++) {
				ab[i][j] = sc.nextInt();
			}
			if(result[ab[i][0]-1] == 0 || result[ab[i][1]-1] == 0) {
				if(h[ab[i][0]-1] < h[ab[i][1]-1]) {
					result[ab[i][0]-1] = 1;
				}else if(h[ab[i][0]-1] == h[ab[i][1]-1]){
					result[ab[i][0]-1] = 1;
					result[ab[i][1]-1] = 1;
				}else {
					result[ab[i][1]-1] = 1;
				}
			}
		}

		int totalcount = 0;
		for(int i = 0;i < n;i++) {
			if(result[i] == 0) {
				totalcount++;
			}
		}

		System.out.println(totalcount);

	}

}
