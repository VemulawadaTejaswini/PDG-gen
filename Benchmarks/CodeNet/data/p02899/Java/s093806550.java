import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(sc.next()); //出席番号i+1の生徒が入室したときに教室にいる人数
		sc.close();

		int ans = 1;
		while (ans <= n) {
			for (int i = 0; i < n; i++) {
				if (a[i] == ans) {
					System.out.println(i + 1);
					ans++;
				}
			}
		}
	}
}