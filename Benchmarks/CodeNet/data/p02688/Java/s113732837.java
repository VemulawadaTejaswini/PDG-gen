import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		boolean[][] hasOkasi = new boolean[n][k];
		
		for(int i = 0; i < k; i++) {
			int d = sc.nextInt();
			for(int j = 0; j < d; j++) {
				int temp = sc.nextInt() - 1;
				hasOkasi[temp][i] = true;
			}
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			count++;
			for(int j = 0; j < k; j++) {
				if(hasOkasi[i][j]) {
					count--;
					break;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
