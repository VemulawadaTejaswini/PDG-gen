import java.util.Scanner;

// https://atcoder.jp/contests/abc166/tasks/abc166_C
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] h = new int[n];
		boolean[] ans = new boolean[n];
		for(int i=0;i<n;i++) {
			h[i]=sc.nextInt();
			ans[i]=true;
		}

		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(h[a-1]>h[b-1]) {
				ans[b-1]=false;
			}
			if(h[a-1]==h[b-1]) {
				ans[a-1]=false;
				ans[b-1]=false;
			}
			if(h[a-1]<h[b-1]) {
				ans[a-1]=false;
			}
		}
		sc.close();

		int ans1 = 0;
		for(int i=0;i<n;i++) {
			if(ans[i]) {
				ans1++;
			}
		}
		System.out.println(ans1);




	}
}
