import java.util.Scanner;

public class ABC139D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		sc.close();
		System.out.println(n * (n-1) / 2);
	}

}