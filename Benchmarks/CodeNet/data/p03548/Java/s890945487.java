import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		sc.close();
		
		X = X - Z * 2;
		int result = 0;
		for (int i = 1;;i++) {
			if (Y * i + Z * (i - 1)> X) {
				result = i - 1;
				break;
			}
		}
		
		System.out.println(result);
	}
}