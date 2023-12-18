import java.util.Scanner;

// B - Great Ocean View
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	String[] s = S.split("");
	int count = 0;
	if (s.length == 1) {
		System.out.println("0");
		return;
	}
	for (int i = 0; i < s.length - 1; i++) {
		if (s[i].equals(s[i+1])) {
			if (s[i+1].equals("0")) {
				s[i+1] = "1";
				count++;
			} else if (s[i+1].equals("1")) {
				s[i+1] = "0";
				count++;
			}
		}
	}
	if (s[s.length-1].equals(s[s.length-2])) { // 最後の要素
		if (s[s.length-1].equals("0")) {
			s[s.length-1] = "1";
			count++;
		} else if (s[s.length-1].equals("1")) {
			s[s.length-1] = "0";
			count++;
		}
	}
//	for (int i = 0; i < s.length; i++) {
//		System.out.print(s[i]);
//	}
	System.out.println(count);
	}
}