import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().execute(System.in);
	}

	public void execute(InputStream in) {
		Scanner sc = new Scanner(in);
		
		int k = sc.nextInt();
		String s = sc.next();
		
		if (s.length() <= k) {
			System.out.println(s);
		}
		else {
			System.out.println(s.substring(0, k) + "...");
		}
		sc.close();
	}
}
