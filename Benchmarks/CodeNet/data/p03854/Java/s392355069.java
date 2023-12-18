import java.util.Scanner;

public class Main {
    private static final String[] reversedWords = {"remaerd", "resare", "maerd", "esare"};


	public static void main(String[] args) {
		String s;
		try (Scanner scanner = new Scanner(System.in)) {
			s = scanner.next();
		}

		String t = new StringBuffer(s).reverse().toString();
		String temp = "";
		while (! t.equals(temp)) {
		    System.out.println("temp: " + temp);
			temp = t;
			for (String word: Main.reversedWords) {
				t = t.replaceFirst("^" + word, "");
		        System.out.println("t: " + t);
			}
		}

		if (t.isEmpty()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}