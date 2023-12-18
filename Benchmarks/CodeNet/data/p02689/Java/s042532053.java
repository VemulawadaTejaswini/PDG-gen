import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int n;
	int m;
	int q;
	int h[];
	int a[];
	int b[];
	int ans[];
	int count;

	public void run() {
		Scanner sc = new Scanner(System.in);

		// 入力値取得
		n = sc.nextInt();
		m = sc.nextInt();
		h = new int[n];
		a = new int[m];
		b = new int[m];
		for(int i=0; i<n; i++) {
			h[i] = sc.nextInt();
		}
		for(int i=0; i<m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		sc.close();

		// 解答処理
		ans = new int[n];
		Arrays.fill(ans, 1);
		check();
		count = 0;
		for(int i=0; i<n; i++) {
			if(ans[i] == 1) count++;
		}

		System.out.println(count);
	}

	private void check() {
		for(int i=0; i<m; i++) {
			if(h[a[i]-1] < h[b[i]-1]) {
				ans[a[i]-1] = 0;
			} else {
				ans[b[i]-1] = 0;
			}
			if(h[b[i]-1] < h[a[i]-1]) {
				ans[b[i]-1] = 0;
			} else {
				ans[a[i]-1] = 0;	
			}
		}
	}
}
