import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		BigInteger sum = BigInteger.ZERO;
		BigInteger[] nums = new BigInteger[100001];
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (nums[num] == null) {
				nums[num] = BigInteger.ONE;
			} else {
				nums[num] = nums[num].add(BigInteger.ONE);
			}
			sum = sum.add(BigInteger.valueOf(num));
		}
		sc.nextLine();
		int q = sc.nextInt();
		List<BigInteger> sumList = new ArrayList<BigInteger>();
		for (int i = 0; i < q; i++) {
			sc.nextLine();
			int b = sc.nextInt();
			int c = sc.nextInt();
			BigInteger bigB = BigInteger.valueOf(b);
			BigInteger bigC = BigInteger.valueOf(c);
			BigInteger cnt = nums[b] == null ? BigInteger.ZERO : nums[b];
			sum = sum.add(bigC.multiply(cnt));
			sum = sum.subtract(bigB.multiply(cnt));
			sumList.add(sum);
			
			if (nums[c] == null) {
				nums[c] = cnt;
			} else {
				nums[c] = nums[c].add(cnt);
			}
			nums[b] = BigInteger.ZERO;
		}
		
		for (BigInteger i : sumList) {
			System.out.println(i);
		}
	}
}
