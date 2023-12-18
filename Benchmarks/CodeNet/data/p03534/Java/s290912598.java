import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int[] a = new int[3];
		for(int i = 0 ; i < n ; i++) {
			if(s.charAt(i) == 'a') {
				a[0]++;
			} else if(s.charAt(i) == 'b') {
				a[1]++;
			} else if(s.charAt(i) == 'c') {
				a[2]++;
			}
 		}
		boolean ok = true;
		if(a[0] >= 1 && a[1] >= 1 && a[2] >= 1) {
			// 3種類
			if(Math.abs(a[0] - a[1]) >= 2 || Math.abs(a[0] - a[2]) >= 2 || Math.abs(a[1] - a[2]) >= 2) {
				ok = false;
			}
		} else if((a[0] == 0 && a[1] >= 1 && a[2] >= 1) || (a[0] >= 1 && a[1] == 0 && a[2] >= 1) || (a[0] >= 1 && a[1] >= 1 && a[2] == 0)) {
			// 2種類
			if(!(n == 2 && s.charAt(0) != s.charAt(1))) {
				ok = false;
			}
		} else if((a[0] == 0 && a[1] >= 0 && a[2] >= 1) || (a[0] >= 0 && a[1] == 1 && a[2] >= 0) || (a[0] >= 1 && a[1] >= 0 && a[2] == 0)) {
			// 1種類
			if(n != 1) {
				ok = false;
			}
		}
			if(ok == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
