import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			String method = scan.next();
			int a = scan.nextInt();
			int b = scan.nextInt();
			if (method.equals("print")) {
				print(str, a, b);
			} else if (method.equals("reverse")) {
				str = reverse(str, a, b);
			} else if (method.equals("replace")){
				String p = scan.next();
				str = replace(str, a, b, p);
			}
		}
	}
	void print(String str, int a, int b){
		System.out.println(str.substring(a, b + 1));
	}
	String reverse(String str, int a, int b){
		String s = str.substring(a, b + 1);
		StringBuilder strbul = new StringBuilder(s).reverse();
		return str.replace(s, strbul.toString());
	}
	String replace(String str, int a, int b, String p) {
		String s1 = str.substring(0, a);
		String s2 = str.substring(b + 1, str.length());
		return s1 + p + s2;
	}
	public static void main(String[] args) {
		new Main().run();
	}
}