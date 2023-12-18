
import java.util.Scanner;

/**
 * Created by Taichi1 on 10/22/16.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt(), b = sc.nextInt();
		int index = 1;
		while (index < n) {
			int ar = sc.nextInt(), br = sc.nextInt();
			int multiplier = Math.max((a - 1) / ar, (b-1) / br) + 1;
			a = ar * multiplier;
			b = br * multiplier;
			index++;
		}
		System.out.println(a + b);

	}

}