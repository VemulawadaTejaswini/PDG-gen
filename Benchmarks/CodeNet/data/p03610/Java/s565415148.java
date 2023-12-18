import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			if (i % 2 == 0) {
				b += a.substring(i, i+1);
			}
		}
		System.out.println(b);
	}

}