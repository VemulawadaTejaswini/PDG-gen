import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), x = sc.nextLong();
		sc.close();
		long ans = 0;
		ans = 4 * (n - x);
		System.out.println(ans);
	}

}
