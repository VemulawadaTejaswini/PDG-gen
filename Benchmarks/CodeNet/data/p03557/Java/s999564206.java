
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, a[][];
		
		n = sc.nextInt();
		a = new int[3][n];
		for(int i = 0; i < 3; ++i) {
			for(int j = 0; j < n; ++j) {
				a[i][j] = sc.nextInt();
			}
		}
		
		//sort
		for(int i = 0; i < 3; ++i) {
			for(int j = 0; j < n; ++j) {
				for(int k = j + 1; k < n; ++k) {
					if(a[i][j] > a[i][k]) {
						int tmp = a[i][j];
						a[i][j] = a[i][k];
						a[i][k] = tmp;
					}
				}
			}
		}
		
		int ans = 0;
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				if(a[0][i] < a[1][j]) {
					for(int k = 0; k < n; ++k) {
						if(a[1][j] < a[2][k]) {
							ans += n - k;
							break;
						}
					}
				}
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}
