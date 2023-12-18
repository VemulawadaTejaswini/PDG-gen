import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.next()+sc.next()+sc.next());
		System.out.println(num % 4 == 0 ? "YES" : "NO");
	}
}
