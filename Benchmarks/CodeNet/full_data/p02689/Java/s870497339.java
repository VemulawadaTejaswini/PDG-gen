import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = scan.nextInt();
		}
		boolean[] judge = new boolean[n];
		
		for(int i = 0; i < judge.length; i++) {
			judge[i] = true;
		}
		
		for(int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(h[a-1] < h[b-1]) {
				judge[a-1] = false;;
			}
			else if(h[a-1] > h[b-1]) {
				judge[a-1] = false;
			}
			else {
				judge[a-1] = false;
				judge[b-1] = false;
			}
		}
		int ans = 0;
		for(int i = 0; i < judge.length; i++) {
			if(judge[i] == true) {
				ans++;
				//System.out.print(1);
			}
			else{
				//System.out.print(0);
			}
		}
		
		System.out.print(ans);
		
	}

}
