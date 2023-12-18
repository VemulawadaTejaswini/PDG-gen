import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int count = 0;
		long ans = 0;
		long M = 0; long m = 0;
		long[] a = new long[s.length];
		a[0] = 1;

		for(int i = 1; i < s.length; i++) {
			if(s[i] == s[i-1]) {
				a[count]++;
			}else{
				count++;
				a[count]++;
			}
		}

		if(s[0] == '>') {
			if(s[s.length-1] == '<') {
				ans += (a[0]+1)*a[0]/2;
				for (int i = 0; i < (count-1)/2; i++) {
					M = Math.max(a[2*i+1], a[2*i+2]);
					m = Math.min(a[2*i+1], a[2*i+2]);
					ans += (m-1)*m/2;
					ans += (M+1)*M/2;
				}
				ans += a[count]*(a[count]+1)/2;
			}else {
				ans += (a[0]+1)*a[0]/2;
				for (int i = 0; i < count/2; i++) {
					M = Math.max(a[2*i+1], a[2*i+2]);
					m = Math.min(a[2*i+1], a[2*i+2]);
					ans += (m-1)*m/2;
					ans += (M+1)*M/2;
				}
			}
		}else {
			if(s[s.length-1] == '<') {
				for (int i = 0; i < count/2; i++) {
					M = Math.max(a[2*i], a[2*i+1]);
					m = Math.min(a[2*i], a[2*i+1]);
					ans += (m-1)*m/2;
					ans += (M+1)*M/2;
				}
				ans += a[count]*(a[count]+1)/2;
			}else {
				for (int i = 0; i < (count+1)/2; i++) {
					M = Math.max(a[2*i], a[2*i+1]);
					m = Math.min(a[2*i], a[2*i+1]);
					ans += (m-1)*m/2;
					ans += (M+1)*M/2;
				}
			}
		}

		System.out.println(ans);
		sc.close();
	}
}