

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str[] = br.readLine().split(" ");
			if (str[0] == "") {
				break;
			}
			// String[] str = scan.nextLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = a + b;
			int count = 10;
			int result = 0;
			for (int i = 1; i < 7; i++) {
				if ((c - count) < 0) {
					result = i;
					break;
				}
				count = count * 10;
			}
			System.out.println(result);
		}

	}
}