import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B =sc.nextInt();
		if ((A*10+B)%4==0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}