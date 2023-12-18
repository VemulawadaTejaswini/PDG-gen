import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		String v = "aiueo";
		System.out.println(v.contains(c) ? "vowel" : "consonant");
		sc.close();
	}
}