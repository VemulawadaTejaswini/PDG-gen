import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		String b = sc.next();
		sc.close();
		int bInt = Integer.valueOf(b.replace(".", ""));
		System.out.println(a*bInt/100);

	}

}