import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int sum = 0;

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int x = gcd(i + 1, j + 1);
				for(int k = 0; k < n; k++) {
					sum += gcd(x, k + 1);
				}
			}
		}

		System.out.println(sum);

		sc.close();
	}

	public static int gcd(int x, int y) {
        int biggerNum = Math.max(x, y);
        int smallerNum = Math.min(x, y);

        // 大きい方から小さい方を割った余を求める
        int surplus = biggerNum % smallerNum;

        // 割り切れていれば、それを返す
        if (surplus == 0) {
            return smallerNum;
        }
        // 割り切れなければ再帰的に自信を呼び出す
        surplus = gcd(smallerNum, surplus);

        return surplus;
	}

}