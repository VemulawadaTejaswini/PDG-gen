import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		if (N % 2 != 0) {
			System.out.println("No");
		} else {
			String s = scn.next();
			String s1 = s.substring(0, N / 2);
			String s2 = s.substring(N / 2);
			if (s1.equals(s2)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}