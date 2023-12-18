import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int n = s.length;
		int c = n / 2;
		int r = n-1, l = 0;
		for(int i=c;i<n;i++) {
			if (s[i] != s[c]) {
				r = i - 1;
				break;
			}
		}
		for(int i=c;i>=0;i--) {
			if (s[i] != s[c]) {
				l = i + 1;
				break;
			}
		}
//		System.out.println(l + " " + r);
		System.out.println(n - Math.max(n-1-r, l));
	}

}
