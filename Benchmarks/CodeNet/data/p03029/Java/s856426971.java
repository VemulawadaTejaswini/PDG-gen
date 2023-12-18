import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String[] input = bf.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int p = Integer.parseInt(input[1]);

			System.out.println(BigDecimal.valueOf((a * 3 + p) / 2, 0));
		} catch (Exception e) {
		}
	}
}
