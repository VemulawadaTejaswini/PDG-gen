import java.util.Scanner;

public class Main {

	public static String decode (String code) {
		char[] alp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] c = code.toCharArray();
		for (int i = 0; i <= 25; i++) {
			for (int j = 0; j < c.length; j++) {
				if (97 <= c[j] && c[j] <= 122)
					c[j] = alp[(c[j] - 97 + 1) % 26];
			}
			String res = String.valueOf(c);
			if (res.indexOf("the") != -1 || res.indexOf("this") != -1 || res.indexOf("that") != -1)
				return res;
		}
		return code;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String code = sc.nextLine();
			System.out.println(decode(code));
		}

	}

}