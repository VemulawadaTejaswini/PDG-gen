import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n[] = new int[4];

		for (int i = 0; i < 3; i++) {
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;

			n[a]++;
			n[b]++;
		}

		boolean flag = false;
		for (int i = 0; i < 4; i++) {
			if (n[i] == 3)
				flag = true;
		}

		if (flag)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}