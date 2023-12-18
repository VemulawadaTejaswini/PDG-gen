import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sd = sc.next().split("");
		String[] t = sc.next().split("");
		boolean r = true;
		int start = 0;
		int end = 0;
		for (int i = 0; i <= sd.length - t.length; i++) {
			r = true;
			for (int j = 0; j < t.length; j++) {
				if (!t[j].equals(sd[i + j]) && !sd[i + j].equals("?")) {
					r = false;
					break;
				}
			}
			if (r) {
				start = i;
				end = i + t.length;
				break;
			}
		}
		if (r) {
			String[] s = new String[sd.length];
			for (int i = 0; i < start; i++) {
				s[i] = (sd[i].equals("?"))? "a" : sd[i];
			}
			for (int i = start; i < end; i++) {
				s[i] = t[i - start];
			}
			for (int i = end; i < s.length; i++) {
				s[i] = (sd[i].equals("?"))? "a" : sd[i];
			}
			for (int i = 0; i < s.length; i++) {
				System.out.print(s[i]);
			}
			System.out.println("");
		}
		else
			System.out.println("UNRESTORABLE");
	}
}