import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int L = sc.nextInt();
		int R = sc.nextInt();

		int count = 0;
		int open = 0;

		for(int n=1; n<=N; n++) {
			if(L<=n && n<=R) {
				open += 1;
				L = sc.nextInt();
				R = sc.nextInt();
			}if(open==M) {
			count += 1;
			}
		}
		System.out.println(count);
	}

}
