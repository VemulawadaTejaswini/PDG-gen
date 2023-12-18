import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0 ; i < n ; i++) s[i] = sc.next();
		long[] cnt = new long[5];
		for(int i = 0 ; i < n ; i++) {
			if(s[i].charAt(0) == 'M') cnt[0]++;
			if(s[i].charAt(0) == 'A') cnt[1]++;
			if(s[i].charAt(0) == 'R') cnt[2]++;
			if(s[i].charAt(0) == 'C') cnt[3]++;
			if(s[i].charAt(0) == 'H') cnt[4]++;
		}
		long ans = 0;
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = i + 1 ; j < 5 ; j++) {
				for(int k = j + 1 ; k < 5 ; k++) {
					ans += cnt[i] * cnt[j] * cnt[k];
				}
			}
		}
		System.out.println(ans);
	}
}
