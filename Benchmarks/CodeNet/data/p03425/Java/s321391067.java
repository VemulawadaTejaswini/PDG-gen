import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0 ; i < n; i++) s[i] = sc.next();
		long[] a = new long[5];
		for(int i = 0 ; i < n ; i++) {
			if(s[i].charAt(0) == 'M') a[0]++;
			if(s[i].charAt(0) == 'A') a[1]++;
			if(s[i].charAt(0) == 'R') a[2]++;
			if(s[i].charAt(0) == 'C') a[3]++;
			if(s[i].charAt(0) == 'H') a[4]++;
		}
		long ans = 0;
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = i + 1 ; j < 5 ; j++) {
				for(int k = j + 1 ; k < 5 ; k++) {
					ans += a[i] * a[j] * a[k];
				}
			}
		}
		System.out.println(ans);
	}
}
