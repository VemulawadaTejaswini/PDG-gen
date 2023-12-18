import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		boolean[][] ki = new boolean[n][n];
		int[] ans = new int[n];
		
		for(int i=0;i<n-1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			ki[a-1][b-1] = true;
			ki[i][i] = true;
			for(int j=a-2;j>=0;j--) {
				if(ki[j][a-1]) {
					ki[j][b-1]=true;
				}
			}
			
			
		}
		
		for(int i=0;i<q;i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			p--;
			for(int j=p;j<n;j++) {
				if(ki[p][j]) {
					ans[j] += x;
				}
			}
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.print(ans[i]);
			System.out.print(" ");
		}

		
		
		
		
	}
}
