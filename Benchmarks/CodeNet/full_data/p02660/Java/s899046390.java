import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();

		Set<Long> factorSet = new HashSet<Long>();


		if (num == 1) {
			System.out.println(0);
		} else {
			Main main = new Main();
			long[] con = new long[1];
			main.factorChk(num, factorSet, con);
			System.out.println(con[0]);
		}

	}

	public void factorChk(long num,Set<Long> factorSet,long[] con) {
		boolean haveDiviorFlg = false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0 && factorSet.contains((long)i) == false) {
				con[0]++;
				factorSet.add((long)i);
				num = num / i;
				haveDiviorFlg = true;
			}
		}
		if (haveDiviorFlg) {
			factorChk(num, factorSet, con);
		}else {
			if (factorSet.contains(num) == false) {
				con[0]++;
				factorSet.add(num);
			}
		}
	}

}