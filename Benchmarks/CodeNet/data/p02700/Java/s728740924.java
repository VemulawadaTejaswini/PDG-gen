import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int ao = (int)Math.ceil((double) a / (double) d);
		int taka = (int)Math.ceil((double) c / (double) b);
		
		if (ao < taka) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		sc.close();
	}
}
