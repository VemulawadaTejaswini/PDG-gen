import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		int m2 = sc.nextInt();
		int d2 = sc.nextInt();
		if(d2 == 1) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		sc.close();
	}
}