import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String q = sc.next();
		int N = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < N; ++i) {
			String str = sc.next();
			str += str;
			if (str.indexOf(q) >= 0) ++ans; 
		}
		System.out.println(ans);
	}

}