import java.util.Scanner;

/**
 * @author a-pz
 *
 */
public class DayDream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DayDream dd = new DayDream();

		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

		System.out.println(dd.matchToDelete(S));
	}

	enum Word {
		DREAMERDREAMER, DREAMERERASER, DREAMERDREAM, DREAMERERASE,
		ERASERDREAMER , ERASERERASER , ERASERDREAM , ERASERERASE,
		DREAMDREAMER, DREAMERASER,  DREAMDREAM, DREAMERASE,
		ERASEDREAMER, ERASEERASER, ERASEDREAM, ERASEERASE,
		DREAMER, ERASER, DREAM, ERASE

		;

		public String getValue() {
			return this.name().toLowerCase();
		}
	}

	public String matchToDelete(String S) {
		for (Word word:Word.values()) {
			S = S.replace(word.getValue(), "");
		}

		return S.length() == 0 ? "YES" : "NO";
	}

}
