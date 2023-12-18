import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int len = Math.abs(a-b);
		int height = 0;
		for(int i=1; i<=len; i++) {
			height += i;
		}
		System.out.println(height-Math.max(a, b));
	}
}
