import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			String s = sc.next();
			System.out.println(a >= 3200 ? s : "red");
		}
	}
}