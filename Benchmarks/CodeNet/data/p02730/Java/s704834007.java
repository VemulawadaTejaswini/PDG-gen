import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		String s1 = S.substring(0, (N - 1) / 2);
		StringBuffer s2_temp = new StringBuffer(S.subSequence((N + 3) / 2 - 1, N));
		String s2 = new String(s2_temp.reverse());
		if(s1.equals(s2)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
