import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
//		String s2 = new StringBuilder(sc.next()).reverse().toString();
		String s2 = new StringBuffer(sc.next()).reverse().toString();

		System.out.println((s1.equals(s2)) ?  "YES" : "NO");

		sc.close();


	}

}


