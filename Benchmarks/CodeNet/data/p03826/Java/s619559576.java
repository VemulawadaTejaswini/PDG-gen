import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int rec1 = a*b;
		int rec2 = c*d;
		if (rec1 > rec2) {
			System.out.println(rec1);
		}else {
			System.out.println(rec2);
		}
	}
}
