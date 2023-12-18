import java.util.Scanner;

// https://atcoder.jp/contests/abc166/tasks/abc166_C
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] array = new int[n];
		boolean[] ans = new boolean[n];
		boolean[] ans1 = new boolean[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
			ans[i]=false;
			ans1[i]=true;
		}


		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			ans1[a-1]=false;
			ans1[b-1]=false;
			if(array[b-1]>=array[a-1]) {
				ans[a-1] = true;
			}
		}
		sc.close();

		int ans2 = 0;
		for(int i=0;i<n;i++) {
			if(ans[i]||ans1[i]) {
				ans2++;
			}
		}
		System.out.println(ans2);
	}
}
