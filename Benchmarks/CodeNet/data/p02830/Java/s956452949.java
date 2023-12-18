
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		char[] sAry = s.toCharArray();
		char[] tAry = t.toCharArray();
		char[] ans = new char[2 * n];
		for(int i = 0; i < n; i++){
			ans[2 * i] = sAry[i];
			ans[2 * i + 1] = tAry[i];
		}
		System.out.println(new String(ans));
	}
}
