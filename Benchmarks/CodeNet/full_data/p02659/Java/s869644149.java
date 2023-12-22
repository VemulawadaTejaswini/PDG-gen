import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		String b = sc.nextLine();
		sc.close();
		b.replace(".", "");
		int bInt = Integer.valueOf(b);
		System.out.println(a*bInt/100);

	}

}