import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mew = sc.next();
		sc.close();

		while (mew.indexOf("mew") != -1 && !mew.equals("mew")) {
			mew = mew.replaceAll("mew", "");
		}

		if (mew.equals("mew")) {
			System.out.println("Cat");
			return;
		}
		System.out.println("Rabbit");
	}
}