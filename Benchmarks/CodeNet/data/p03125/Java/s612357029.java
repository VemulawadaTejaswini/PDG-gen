import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int a = Integer.parseInt(sc.next());
	static int b = Integer.parseInt(sc.next());
	public static void main(String[] args) {
		if (b%a==0) {
			System.out.println(a+b);
		} else {
			System.out.println(b-a);
		}
	}
}
