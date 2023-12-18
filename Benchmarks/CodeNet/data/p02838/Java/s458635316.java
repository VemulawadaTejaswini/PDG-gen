
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[61];
		for(int i = 0; i < 61; i++) {
			list[i] = 0;
		}
		for(int i = 0; i < n; i++) {
			BigInteger a = new BigInteger(sc.next());
			for(int j = 0; j < 61; j++) {
				if(a.and(new BigInteger("1")).equals(new BigInteger("1"))) {
					list[j]++;
				}
				a = a.divide(new BigInteger("2"));
			}
		}
		BigInteger div = new BigInteger(Long.toString((long) Math.pow(10, 9) + 7));
		BigInteger ans = new BigInteger("0");
		for(int i = 0; i < 61; i++) {
			ans = ans.add(new BigInteger(Integer.toString(list[i])).multiply(new BigInteger(Integer.toString(n - list[i]))).multiply(new BigInteger("2").pow(i).remainder(div)));
			ans = ans.remainder(div);
		}
		System.out.println(ans.toString());

	}

}
