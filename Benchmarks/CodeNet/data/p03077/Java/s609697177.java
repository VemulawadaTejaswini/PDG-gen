import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();

		long[] a = new long[5];
		long min = 100000;
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
			min = Math.min(a[i], min);
		}

		long cnt = (N / min) + 5;

		System.out.println(cnt);
	}

}
