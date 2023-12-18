import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		boolean kisuu = true;
		boolean gusu = true;

		for (int i=1; i <= n.length(); i++) {
			Character chara = n.charAt(i-1);
			if(i % 2 == 0) {
				if('R' == chara) {
					gusu = false;
				}
			}
			if(i % 2 == 1) {
				if('L' == chara) {
					kisuu = false;
				}
			}
		}

		if(gusu && kisuu) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}