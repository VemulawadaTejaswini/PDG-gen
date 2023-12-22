package Volume0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;

		int n;

		try {
			s = br.readLine();
			n = Integer.parseInt(s);

			int[][] tri = new int[n][3];
			int i, j;
			i = j = 0;

			while (null != (s = br.readLine())) {
				Scanner sc = new Scanner(s);
				j = 0;
				while (sc.hasNext()) {
					tri[i][j] = sc.nextInt();
					j++;
				}
				Arrays.sort(tri[i]);
				i++;
			}

			//
			for (i = 0; i < n; i++) {
				int a, b, c;
				a = tri[i][0];
				b = tri[i][1];
				c = tri[i][2];
				if (c * c == a * a + b * b) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}