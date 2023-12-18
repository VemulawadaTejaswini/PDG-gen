import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		// 直接
		if (Math.abs(a - c) <= d){
			System.out.println("Yes");
			return;
		}
		// 間接
		if (Math.abs(a - b) > d){
			System.out.println("No");
			return;
		}
		if (Math.abs(b - c) > d){
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}