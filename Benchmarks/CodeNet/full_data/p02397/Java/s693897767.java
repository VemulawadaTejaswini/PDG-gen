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
			// String line = br.readLine();
			String[] strList = line.split(" ", 0);

			int num1 = Integer.parseInt(strList[0]);
			int num2 = Integer.parseInt(strList[1]);

			// char char1 = str.charAt(1);
			// char char2 = str.charAt(3);
			// int num1 = Integer.parseInt("" + char1);
			// int num2 = Integer.parseInt("" + char2);

			if (num1 == 0 && num2 == 0) {

			} else if (num1 > num2) {
				System.out.println(num2 + " " + num1);
			} else {
				System.out.println(num1 + " " + num2);
			}

		}
	}

}