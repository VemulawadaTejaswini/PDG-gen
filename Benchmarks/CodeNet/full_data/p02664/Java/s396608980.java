import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String T = sc.next();
		sc.close();
		// D および PD
		// DD と PD 重み一緒
		System.err.println(T.replace("?", "D"));
	}
}
