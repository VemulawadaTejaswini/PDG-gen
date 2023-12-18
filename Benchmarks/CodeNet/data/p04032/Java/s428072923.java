import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = "";
		String s2 = "";
		String s3 = "";
		for(int i = 0; i < s.length(); i++) {
			if(i == 0) {
				s1 = s.substring(0, 1);
			} else if(i == 1) {
				s2 = s1;
				s1 = s.substring(1, 2);
				if(s2.equals(s1)) {
					System.out.println(1 + " " + 2);
					return;
				}
			} else {
				s3 = s2;
				s2 = s1;
				s1 = s.substring(i, i + 1);
				if(s1.equals(s2)) {
					System.out.println(i + " " + (i + 1));
					return;
				} else if(s1.equals(s3)) {
					System.out.println((i - 1) + " " + (i + 1));
					return;
				}
			}
		}
		System.out.println(-1 + " " + -1);
	}
}
