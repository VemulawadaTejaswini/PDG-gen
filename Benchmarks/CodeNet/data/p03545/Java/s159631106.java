
import java.util.Scanner;

public class Main {

	static String ans = "";
	static int[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		a = new int[4];
		for(int i = 0 ; i < 4 ; i++) {
			a[i] = s.charAt(i) - '0';
		}
		for(int i = 0 ; i < (1<<3) ; i++) {
			String ans = String.valueOf(a[0]);
			int sum = a[0];
			for(int j = 0 ; j < 3 ; j++) {
				if((i & (1<<j)) == 0) {
					ans += "+";
					ans += (char)(a[3 - j] + '0');
					sum += a[3 - j];
				} else {
					ans += "-";
					ans += (char)(a[3 - j] + '0');
					sum -= a[3 - j];
				}
			}
			if(sum == 7) {
				System.out.println(ans + "=7");
				return;
			}
		}
	}
}