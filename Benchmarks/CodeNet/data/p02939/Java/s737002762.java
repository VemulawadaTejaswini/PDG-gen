import java.util.Scanner;

//AtCoder Grand Contest 037
//A	Dividing a String
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		int count = 0;
		char pre = S.charAt(0);
		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i) == pre) {
				count++;
				pre = ' ';
				i++;
			} else {
				pre = S.charAt(i);
			}
		}

		long ans = S.length() - count;

		System.out.println(ans);
	}
}
