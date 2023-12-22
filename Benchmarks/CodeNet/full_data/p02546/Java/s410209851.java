import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		if(s.substring(s.length() - 1).equals("s")) {
			s += "es";
		} else {
			s += "s";
		}
 		prtln(s);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
