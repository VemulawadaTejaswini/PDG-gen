import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		sc.close();

		var a = new String[] {"pon", "pon", "hon", "bon", "hon", "hon", "pon", "hon", "pon", "hon"};
		System.out.println(a[n % 10]);
	}
}