import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(a + " " + b + " " + (- a - b + 3 * c));
		System.out.println((-2 * a - b + 4 * c) + " " + c + " " +  (2 * a + b - 2 * c));
		System.out.println((a + b - c) + " " + (- b + 2 * c) + " " + (- a + 2 * c));
	}
}