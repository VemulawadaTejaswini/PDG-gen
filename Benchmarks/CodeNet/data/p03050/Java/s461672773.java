import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long ans = 0;
		for(int i = 1; i <= N/i; i++) {
			if((N-i) % i == 0)
				ans += (N-i)/i;
		}
		System.out.println(ans);

	}

}
