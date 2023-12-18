//===================== Author Info ==================
//  Khaled Alam (Ninjo)   ~   khaledalam.net@gmail.com
//====================================================
import java.util.*;

public class Main {
	public long res = 1;

	public static long ans(int n) {
		if (n == 1)
			return 1;
		return n + ans(n - 1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		System.out.println(ans(n));

	}
}