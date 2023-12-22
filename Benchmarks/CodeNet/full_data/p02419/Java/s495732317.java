import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String t = " ";
		
		while (sc.next() != "END_OF_TEXT") {
			t += sc.next();
		}
		String w = sc.next();
		for (int i = 0; i < t.length(); i++) {
			if (t.contains(w)) {
				count++;
			}
		}
		System.out.println(count);
	}
}