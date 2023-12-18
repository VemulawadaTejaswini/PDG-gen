import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c = scanner.nextInt();
		int k = scanner.nextInt();
		int ans = 1;
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = scanner.nextInt();
		}
		Arrays.sort(t);

		for (int i = 1,b=1,r=t[0]; i < n; i++) {
			while (r + k >= t[i]) {
				if (b < c) {
					b++;
					i++;
					if(i==n){
						break;
					}
				} else {
					break;
				}
			}
			if(i<n){
				ans++;
				r=t[i];
				b=1;
			}
		}
		System.out.println(ans);
	}
}