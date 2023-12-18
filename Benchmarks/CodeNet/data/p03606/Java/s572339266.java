import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int l[] = new int [N];
		int r[] = new int [N];
		for(int i=0;i<N;i++){
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		int ans = 0;

		for(int j=0;j<N;j++){
			ans += r[j] - l[j] + 1;
		}

		// 出力
		System.out.println(ans);
	}
}
