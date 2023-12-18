
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int a[][] = new int[n][n];

		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
				sum += a[i][j];
			}
		}

		sum /= 2;

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				boolean flag = false;
				for (int k = 0; k < n; k++) {
					if(k == i || k == j){
						continue;
					}
					
					if(a[i][j] > a[i][k] + a[k][j]){
						System.out.println("-1");
						return;
					}
					if(a[i][j] == a[i][k] + a[k][j]){
						flag  =true;
					}
				}
				if(flag){
					sum -= a[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}
