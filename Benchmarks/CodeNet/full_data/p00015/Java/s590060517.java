import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String a = br.readLine();
			String b = br.readLine();
			if (a.length() > 80 || b.length() > 80) {
				System.out.println("overflow");
			}
			BigInteger A = new BigInteger(a);
			BigInteger B = new BigInteger(b);
			BigInteger C = A.add(B);
			if (C.toString().length() > 80) {
				System.out.println("overflow");
			}
			System.out.println(C);
		}

		if (br != null) {
			br.close();
			br = null;
		}
	}
}