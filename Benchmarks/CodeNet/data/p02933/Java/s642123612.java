import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		int a = sc.nextInt();
		String str = sc.next();
		String r = a>=3200? str : "red";


		System.out.println(r);

	}
}
