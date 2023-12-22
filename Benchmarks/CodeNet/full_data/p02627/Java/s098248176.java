import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		if(Character.isUpperCase(a.charAt(0))) {
			prtln('A');
		} else {
			prtln('a');
		}
		sc.close();
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
