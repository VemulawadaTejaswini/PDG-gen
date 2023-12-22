

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String argv[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str;
		String triangle_side_str[] = new String[3];
		int max = 0;
		int remain[] = new int[2];
		int triangle_side_int[] = new int[3];
		int N = Integer.parseInt(br.readLine());

		for (int j = 0; j < N; j++) {
			str = br.readLine();
			remain[0] = 0;
			remain[1] = 0;
			max = 0;
			triangle_side_str = str.split(" ");

			for (int i = 0; i < 3; i++) {
				triangle_side_int[i] = Integer.parseInt(triangle_side_str[i]);
				if (max <= triangle_side_int[i]) {
					if (remain[1] == 0)
						remain[1] = max;
					else if (remain[0] == 0)
						remain[0] = max;
					max = triangle_side_int[i];
				} else {
					if (remain[1] == 0)
						remain[1] = triangle_side_int[i];
					else if (remain[0] == 0)
						remain[0] = triangle_side_int[i];
				}

			}
			// System.out.println(max);
			// System.out.println(remain[0]);
			// System.out.println(remain[1]);
			if (Math.pow(remain[0], 2) + Math.pow(remain[1], 2) == Math.pow(max, 2)) {
				System.out.println("YES");
			} else
				System.out.println("NO");

		}

	}

}