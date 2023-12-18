import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] a = new boolean[1_000_000_001];

		for (int i = 0; i < n; i++) {
			//重複があるかジャッジ
			int k = sc.nextInt();
			if(a[k]) {
				System.out.println("NO");
				return;
			}
			//重複ない場合の処理
			a[k] = true;
		}
		System.out.println("YES");

	}

}
