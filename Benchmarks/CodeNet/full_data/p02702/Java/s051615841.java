import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn =  new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		String numStr = stdIn.next();
		int length = numStr.length();

		int cnt = 0;

		char[] strCharArray = numStr.toCharArray();

		for (int i = 0; i < length - 3; i++) {
			int modCheckNum = Integer.parseInt(numStr.substring(i, i + 3));

			for (int j = i + 3; j < length; j++) {
				int currentdigit = strCharArray[j] - '0';
				modCheckNum = (modCheckNum * 10 + currentdigit) % 2019;

				if(modCheckNum == 0) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

		stdIn.close();
	}
}