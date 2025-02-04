import java.util.*;
class Main {
	static int INF = 1 >> 24;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = stdIn.nextInt();
			}
			int max = INF;
			for(int i = 0; i < n; i++) {
				int sum = 0;
				for(int j = i; j < n; j++) {
					sum += a[j];
					if(max < sum) {
						max = sum;
					}
				}
			}
			System.out.println(max);
		}
	}
}