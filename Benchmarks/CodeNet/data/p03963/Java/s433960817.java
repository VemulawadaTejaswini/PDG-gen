import java.util.*;

@SuppressWarnings("unchecked")
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int ans = pow(k-1, n-1);
		System.out.println(ans*k);
	}

	static int pow(int x, int y) {
		if (x == 0) return 0;
		if (y == 0) return 1;

		int res = pow(x, y/2);
		if (y % 2 == 1) return x*res*res;
		return res*res;
	}
}