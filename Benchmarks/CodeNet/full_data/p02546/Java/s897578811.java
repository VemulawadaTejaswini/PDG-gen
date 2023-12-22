public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var s = sc.next();
		var c = s.charAt(s.length() - 1);
		System.out.println((c == 's') ? s + "es" : s + "s");

	}
}
