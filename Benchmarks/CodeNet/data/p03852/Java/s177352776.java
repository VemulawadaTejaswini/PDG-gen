import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String c = scan.next();
		String anser = c.equals("a")
				|| c.equals("e")
				|| c.equals("i")
				|| c.equals("o")
				|| c.equals("u")
						? "vowel"
						: "consonant";
		System.out.println(anser);
	}

}
