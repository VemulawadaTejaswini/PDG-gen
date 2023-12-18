
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int f = 0 - a + b;

		if (x < f) {
			System.out.println("dangerous");;
		} else if (0 < f) {
			System.out.println("safe");
		} else {
			System.out.println("delicious");
		}
	}
}