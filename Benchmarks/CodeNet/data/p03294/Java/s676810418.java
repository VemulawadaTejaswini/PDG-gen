
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		// fはどんなに大きくてもm * anを超えないはず。
		int m_max = 100000;
		int f[] = new int[m_max];
		for (int m = 0; m < m_max; m++) {
			for (int i = 0; i < n; i++) {
				f[m] += m%a[i];
			}
		}

		// fの最大値を求める
		int max_temp = f[0];
		for (int i = 0; i < f.length - 1; i++) {
			max_temp = Math.max(max_temp, f[i+1]);
		}
		System.out.println(max_temp);
	}
}