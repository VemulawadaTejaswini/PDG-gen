import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] s = new String[n];
		int i;
		for(i = 0; i < n; i++) {
			s[i] = scan.next();
		}
		int j;
		int k;
		boolean f;
		char[] a;
		char[] b;
		long ans = 0;
		for(i = 0; i < n - 1; i++) {
			for(j = i + 1; j < n; j++) {
				a = s[i].toCharArray();
				b = s[j].toCharArray();
				Arrays.sort(a);
				Arrays.sort(b);

				f = true;
				for(k = 0; k < 10; k++) {
					if(a[k] != b[k]) {
						f = false;
						break;
					}
				}
				if(f)
					ans++;
			}
		}
		System.out.println(ans);
	}
}