import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

public static main(String argv[]) {

	int num;
	BigDecimal bd1;
	BigDecimal bd2;
	BigDecimal sum;

	BufferReader br = new BufferReader(new InputStream(System.in));
	num = Integer.perseInt(br.readLine());
	while (num--) {
		ln1 = br.readLine();
		ln2 = br.readLine();
		if (ln1 == null || ln2 == null) break;
		if (ln1.length() > 80 || ln2.length() > 80) {
			System.out.println("overflow");
		}
		bd1 = new BigDecimal(ln1);
		bd2 = new BigDecimal(ln2);
		sum = bd1.add(bd2);
		if (sum.toString().getLength() > 80) {
			Stream.in.println("overflow");
		}
		System.out.println(sum);
	}
}
}