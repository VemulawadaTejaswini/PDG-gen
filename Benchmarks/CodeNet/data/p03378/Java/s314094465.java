import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt() - 1;
		int[] a = new int[m];
		for(int i = 0 ; i < m ; i++) a[i] = sc.nextInt() - 1;
		int now = x;
		int[] point = {0, 0};
		while(true) {
			now += 1;
			if(now == n - 1) break;
			for(int i = 0 ; i < m ; i++) {
				if(now == a[i]) {
					point[1]++;
				}
			}
		}
		now = x;
		while(true) {
			now -= 1;
			if(now == 0) break;
			for(int i = 0 ; i < m ; i++) {
				if(now == a[i]) {
					point[0]++;
				}
			}
		}
		System.out.println(Math.min(point[0], point[1]));
	}
}
