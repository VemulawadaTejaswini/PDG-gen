import java.util.Scanner;

// https://atcoder.jp/contests/abc163/tasks/abc163_d
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int[] array = new int[n+1];
		for(int i=0;i<=n;i++) {
			array[i] = i;
		}

		long ans = 1L;

		for(int i=k;i<=n;i++) {
			int max = 0;
			int min = 0;
			for(int j=0;j<i;j++) {
				max = max+array[array.length-j-1];
				min = min+array[j];
			}
			ans = ans + max - min + 1;
		}

		System.out.println(ans%(int)(Math.pow(10, 9)+7));
	}
}
