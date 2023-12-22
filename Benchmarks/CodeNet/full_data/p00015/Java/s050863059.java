import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		try {
			//Input
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			for (int i = 0; i < N; i++) {
				BigDecimal A = new BigDecimal(br.readLine());
				BigDecimal B = new BigDecimal(br.readLine());
				A = A.add(B);
				System.out.println(A);
			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}