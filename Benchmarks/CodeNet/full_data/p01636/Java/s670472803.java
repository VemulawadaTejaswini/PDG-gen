import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String A = "0" + sc.next();
		int ans = 0;
		for (int i = 1; i < A.length(); ++i) {
			String sum = A.substring(i);
			String sub = A.substring(0, i);
			if (sum.charAt(0) == '0' && sum.length() > 1) continue;
			int sumi = Integer.parseInt(sum);
			int subi = Integer.parseInt(sub);
			if ((sumi + subi) % 2 == 0 && sumi >= subi) ++ans;
		}
		System.out.println(ans);
	}

}