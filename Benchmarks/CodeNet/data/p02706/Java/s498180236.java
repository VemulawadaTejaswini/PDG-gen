import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int []a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int val:a) {
			sum += val;
		}
		if (n-sum < 0) {
			System.out.println("-1");
		} else {
			System.out.println(n-sum);
		}
		sc.close();

	}

}