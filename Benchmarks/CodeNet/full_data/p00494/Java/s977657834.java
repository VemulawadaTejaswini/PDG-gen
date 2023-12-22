import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int J[], O[], I[];
		
		s = sc.next();
		J = new int[s.length()];
		O = new int[s.length()];
		I = new int[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'J') {
				if (i == 0) {
					J[0] = 1;
				} else {
					J[i] = J[i - 1] + 1;
				}
			} else if (s.charAt(i) == 'O') {
				if (i == 0) {
					O[0] = 1;
				} else {
					O[i] = O[i - 1] + 1;
				}
			} else if (s.charAt(i) == 'I') {
				if (i == 0) {
					I[0] = 1;
				} else {
					I[i] = I[i - 1] + 1;
				}
			}
		}
		
		int max = 0;
		for (int i = s.length() - 1; 0 <= i; i--) {
			if (0 < I[i]) {
				int k = I[i];
				if (0 <= i - k - k && O[i - k] == k && k <= J[i - k - k]) {
					max = Math.max(max, k);
				}
			}
		}
		System.out.println(max);
	}
}