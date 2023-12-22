
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (; sc.hasNextLine();) {
			String buffer = sc.nextLine();
			String token[] = buffer.replace('=', ' ').replace('+', ' ')
					.split(" ");
			char ret = 0;
			boolean multi = false;
			boolean zeroable = true;
			if (token[0].startsWith("X") || token[1].startsWith("X")
					|| token[2].startsWith("X")) {
				zeroable = false;
			}
			for (char i = '9' + 1; i-- > '0';) {
				if (i == '0' && !zeroable) {
					break;
				}
				BigInteger a = new BigInteger(token[0].replace('X', i));
				BigInteger b = new BigInteger(token[1].replace('X', i));
				BigInteger c = new BigInteger(token[2].replace('X', i));
				if (a.add(b).equals(c)) {
					if (ret == 0) {
						ret = i;
					} else {
						multi = true;
					}
				}
			}
			System.out.println(ret == 0 || multi ? "NA" : ret);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}