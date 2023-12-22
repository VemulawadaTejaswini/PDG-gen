import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int a = scan.nextInt();
		int b = scan.nextInt();
		int area = a * b;
		int cir = 2 * (a + b);
		System.out.printf("%d %d\n", area, cir);
	}
}