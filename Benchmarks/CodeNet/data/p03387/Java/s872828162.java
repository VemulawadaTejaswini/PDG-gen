import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int num[] = new int[3];

		num[0] = Integer.parseInt(str[0]);
		num[1] = Integer.parseInt(str[1]);
		num[2] = Integer.parseInt(str[2]);

		Arrays.sort(num);

		int diff = num[2] - num[0] + num[2] - num[1];
		int ans = diff / 2;
		if (diff % 2 == 1)
			ans += 2;

		System.out.println(ans);
	}
}