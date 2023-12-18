import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ans = 0;
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for(int r = 0; r < n; r++) {
			b[r] = scanner.nextInt();
		}
		scanner.close();
//		int[] ary = new int[n*n];
		for(int l = 0; l < n; l++) {
			for(int k = 0; k < n; k++) {
//				ary[l*n+k] = a[l]+b[k];
				ans ^= (a[l] + b[k]);
			}

		}

//		for(int t : ary) {
//			ans = ans ^ t;
//		}
		System.out.println(ans);
	}

}