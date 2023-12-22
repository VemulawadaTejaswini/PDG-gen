import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

//import org.junit.Test;

public class Main {
//	@Test
//	public void testName() throws Exception {
//		main(null);
//	}

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in))) {

			new Main().solution(br);
		}
	}

	private void solution(BufferedReader br) throws IOException {
		for (String line = br.readLine(); Objects.nonNull(line); line = br
				.readLine()) {
			String[] strList = line.split(" ", 0);

			int num1 = Integer.parseInt(strList[0]);
			int num2 = Integer.parseInt(strList[2]);
			String operator = strList[1];

			if (operator.equals("?")) {
				break;
			}

			int ans = calc(num1, num2, operator);
			System.out.println(ans);

		}
	}

	private int calc(int a, int b, String operator) {
		int result = 0;
		if (operator.equals("+")) {
			result = a + b;
		} else if (operator.equals("-")) {
			result = a - b;
		} else if (operator.equals("*")) {
			result = a * b;
		} else if (operator.equals("/")) {
			result = a / b;
		}

		return result;
	}

}