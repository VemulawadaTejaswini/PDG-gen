import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		sc.close();
		long ans = -1;
		if (x % y != 0) {
			ans = (long)x;
		}
		System.out.println(ans);
	}

}
