import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		prtln("2019/04/30".compareTo(S) >= 0 ? "Heisei" : "TBD");
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}