import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		String a[] = {"dreamer", "dream", "erase", "eraser"};

		String S2 = S;
		for(int i=0;i<S.length(); i++) {
			String str = new String(S2.substring(S.length()-1-i));
			for(String b : a) {
				if(str.equals(b)) {
					S2 = remove(S2, b);
				}
			}
		}

		println(S2.equals("") ? "YES" : "NO");
	}

	public static String remove(String str, String str2) {
		int index = str.indexOf(str2);
		str.substring(0, index);
		str = new String(str.substring(0, index) + str.substring(index+str2.length()));
		return str;
	}
	public static void print(Object o) {
		System.out.print(o);
	}

	public static void println(Object o) {
		System.out.println(o);
	}
}