import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int[] num = new int[2];

			while(true) {
				String[] str = br.readLine().split(" ");
				num[0] = Integer.parseInt(str[0]);
				num[1] = Integer.parseInt(str[2]);

				switch (str[1]) {
				case "+":
					System.out.println(num[0] + num[1]);
					break;
				case "-":
					System.out.println(num[0] - num[1]);
					break;
				case "*":
					System.out.println(num[0] * num[1]);
					break;
				case "/":
					System.out.println(num[0] / num[1]);
					break;
				default:
					break;
				}

				if (str[1].contentEquals("?")) break;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

