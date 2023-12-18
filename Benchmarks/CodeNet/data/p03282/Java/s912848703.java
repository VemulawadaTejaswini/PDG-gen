import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		String[] SSplit = S.split("");
		int countOne = 0;
		for (int i = 0; i < SSplit.length; i++) {
			if ("1".equals(SSplit[i])) {
				countOne++;
			} else {
				break;
			}
		}
		if (K <= countOne) {
			System.out.print(1);
		} else {
			System.out.print(SSplit[countOne]);
		}
	}
}
