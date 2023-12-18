import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		for(int i = 0; i < S.length(); i++) {
			if(i % 2 == 0) {
				if(S.substring(i, i + 1).equals("L")) {
					System.out.println("No");
					return;
				}
			} else {
				if(S.substring(i, i + 1).equals("R")) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
