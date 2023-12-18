import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();

		int len = S.length();
		char[] cs = S.toCharArray();
		char[] ct = T.toCharArray();

		char[] cs2 = S.toCharArray();
		char[] ct2 = T.toCharArray();

		Arrays.sort(cs2);
		Arrays.sort(ct2);

		// 同じ文字を縮めた時の長さを数える
		int s1=1;
		int t1=1;
		boolean b=true;
		for (int i=1;i<len;i++){
			if(cs[i]!=cs[i-1]) {s1++;}
			if(ct[i]!=ct[i-1]) {t1++;}
			if (s1!=t1) {
				b = false;
			}
		}

		// 文字の種別数を数える
		int s2=1;
		int t2=1;
		for (int i=1;i<len;i++){
			if(cs2[i]!=cs2[i-1]) {s2++;}
			if(ct2[i]!=ct2[i-1]) {t2++;}
		}

		if (b && (s2==t2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}