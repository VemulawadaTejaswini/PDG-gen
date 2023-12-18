import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		String v = sc.next();
		int length = v.length();
		String[] ar = new String[length];

		for (int i = 0; i < v.length(); i++) {
			String str = String.valueOf(v.charAt(i));
			ar[i] = str;
		}

		Arrays.sort(ar, Comparator.naturalOrder());
		System.out.println(ar[0]);

		sc.close();
	}

}
