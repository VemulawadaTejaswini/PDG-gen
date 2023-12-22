import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.print(a / b + " " + a % b + " ");
		System.out.printf("%5f\n",(double)a/b);
	}
}