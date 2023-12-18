import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int loop = Math.max(a, b);
		int print = Math.min(a, b);
		for (int i=0;i<loop;i++) {
			System.out.print(print);
		}

	}
}