
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n /15;
		int x = 800 * n, y = a * 200;
		int result = x - y;
		System.out.println(result);
	}
}
