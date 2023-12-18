import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for(int r = 0; r < n; r++) {
			int ans = 0;
			for(int k = 0; k < n; k++) {
				if(k == r) {
					if(k == 0) {
						ans -= Math.abs(a[k]) + Math.abs(a[k+1]-a[k]) - Math.abs(a[k+1]);
					}else if(k == n-1) {
						ans -= Math.abs(a[k]-a[k-1]) + Math.abs(-a[k]) - Math.abs(-a[k-1]);
					}else {
						ans -= Math.abs(a[k]-a[k-1]) + Math.abs(a[k+1]-a[k]) - Math.abs(a[k+1]-a[k-1]);
					}
				}
					
				if(k == 0) {
					ans += Math.abs(-a[k]);
				}else if(k == n-1) {
					ans += Math.abs(a[k] - a[k-1]);
					ans += Math.abs(a[k]);
				}else {
					ans += Math.abs(a[k] - a[k-1]);
				}
			}
			System.out.println(ans);
		}
	}

}