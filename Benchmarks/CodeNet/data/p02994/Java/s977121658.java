import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();

		int L = A;
		int R = A + N - 1;

		int eat;
		if (R <= 0) {
			eat = R;
		} else if (L >= 0) {
			eat = L;
		} else {
			eat = 0;
		}
		int ans = (R + L) * (R - L + 1) / 2 - eat;
		System.out.println(ans);
    }
}
  