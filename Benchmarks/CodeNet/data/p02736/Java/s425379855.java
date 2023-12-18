import java.util.Scanner;

public class Main {

	private static int saiki(int[] a, int n) {
		for(int i = 0; i < n-1; i++) {
			if(a[i+1] - a[i] > 0) {
				a[i] = a[i+1] - a[i];
			}
			else {
				a[i] = a[i] - a[i+1];
			}
		}
		if(n > 2) {
			saiki(a, --n);
		}
		return a[0];
	}

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int n = sca.nextInt();
		int[] ai = new int[n];
		int ans = 0;
		String str = sca.next();
		char ch = 'a';
		for(int i = 0; i < n; i++) {
			ch = str.charAt(i);
			if(ch == '1') {
				ai[i] = 1;
			}
			else if(ch == '2') {
				ai[i] = 2;
			}
			else {
				ai[i] = 3;
			}
		}

		ans = saiki(ai, n);
		System.out.println(ans);

		// 後始末
		sca.close();
	}
}