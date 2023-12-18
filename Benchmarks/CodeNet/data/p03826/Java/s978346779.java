import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt()*sc.nextInt();
		int m = sc.nextInt()*sc.nextInt();
		System.out.println(n>m?n:m);
	}
}
