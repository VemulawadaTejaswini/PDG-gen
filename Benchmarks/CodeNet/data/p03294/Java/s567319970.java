import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n      = Integer.parseInt(br.readLine());
		String[] tmp = br.readLine().split(" ");
		long[] lst  = new long[n];
		long[] min  = new long[n];
		for(int i = 0; i < n; i++) {

			lst[i] = Long.parseLong(tmp[i]);
		}

		min[0] = lst[0];
		for(int i = 1; i < n; i++) {

			min[i] = minbai(lst[i], min[i - 1]);
		}

		long ans = 0;
		long mod = min[n - 1] - 1;
		for(int i = 0; i < n; i++) {

			ans += mod % lst[i];
		}


		System.out.println(ans);

	}

	public static long gcd(long x, long y) {

		if(x % y == 0) {

			return y;

		}else {

			return gcd(y, x % y);

		}

	}

	public static long minbai(long x, long y) {

		return x * y / gcd(x,y);

	}
}
