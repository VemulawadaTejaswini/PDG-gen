import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String temp[];
		int num1;
		int num2;
		int sum;

		temp = br.readLine().split(" ");
		num1 = Integer.parseInt(temp[0]);
		num2 = Integer.parseInt(temp[1]);
		sum = num1 + num2;

		if (sum >= 10 ) {
			System.out.println("error");
		} else {
			System.out.println(sum);
		}
	}
}
