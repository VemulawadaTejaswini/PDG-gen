import java.util.Scanner;
public class Main {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		int a = 0,b = 0;

		a = sc.nextInt();
		b = sc.nextInt();

		if((1 <= a && a <= 20) && (1 <= b && b <= 20)) {
			System.out.println(a * b);
		}else {
			System.out.println("-1");
		}
	}
}
