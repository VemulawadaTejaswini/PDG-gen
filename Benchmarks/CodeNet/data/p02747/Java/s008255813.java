import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		if (s.equals("hi")
				|| s.equals("hihi")
				|| s.equals("hihihi")
				|| s.equals("hihihihi")
				|| s.equals("hihihihihi")
				) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
