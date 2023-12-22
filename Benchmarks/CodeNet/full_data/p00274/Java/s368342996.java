import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			if (N == 0) {
				return;
			}
			int a[] = new int[N];
			int get[] = new int[N];
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}
			int cnt = 0;
			boolean judge = false;
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < N; j++) {
					if (a[j]-- > 0) {
						cnt++;
						get[j]++;
					}
					if (get[j] == 2) {
						judge = true;
						break;
					}
				}
			}
			System.out.println(judge ? cnt : "NA");
		}
	}
}