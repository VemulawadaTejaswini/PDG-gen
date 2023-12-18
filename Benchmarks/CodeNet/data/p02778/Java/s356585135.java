import java.util.Scanner;

public class Main {

	static StringBuilder t;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		t = new StringBuilder();
		for(int i = 0; i < n; i++) {
			t.append("x");
		}
		System.out.println(t);
	}

}
