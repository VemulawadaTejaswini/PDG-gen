import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String p = sc.nextLine();
		s = s + s;
		int pLen = p.length();
		int sLen = s.length();
		int pPoint = 0;
		int sPoint = 0;
		while (sPoint < sLen && pPoint < pLen) {
			if (s.charAt(sPoint) == p.charAt(pPoint)) {
				sPoint++;
				pPoint++;
			} else {
				sPoint = sPoint - pPoint + 1;
				pPoint = 0;
			}
		}
		if (pPoint == pLen) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
