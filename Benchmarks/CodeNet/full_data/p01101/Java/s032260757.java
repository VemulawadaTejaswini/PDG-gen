import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().mainrun();
	}

	private Scanner scan;
	private int n,m;

	private void mainrun() {
		scan = new Scanner(System.in);

		while(true) {
			n = scan.nextInt();
			m = scan.nextInt();

			if(n != 0) {
				looprun();
			}else {
				break;
			}
		}

		scan.close();
	}

	private int[] a;
	private int ans;

	private void looprun() {
		ans = -1;
		a = new int[n];

		for(int i = 0;i < n;i++) {
			a[i] = scan.nextInt();
		}

		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {

				int num = a[i] + a[j];

				if(num <= m && i != j) {
					ans = Math.max(ans, num);
				}
			}
		}
		
		System.out.println((ans != -1 ? ans : "NONE"));
	}

}

