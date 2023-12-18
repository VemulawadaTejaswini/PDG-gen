import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int a[] = new int[N];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		int b[] = new int[1000000];
		for (int i=0;i<N;i++) {
			b[a[i]]++;
		}
		BigDecimal sum = new BigDecimal(0);
		for (int i=0;i<b.length;i++) {
			BigDecimal big = new BigDecimal(b[i]);
			BigDecimal minusone = big.add(new BigDecimal("-1"));
			big= big.multiply(minusone);
			big = big.divide(new BigDecimal(2));
			sum = sum.add(big);
		}
		for (int i=0;i<N;i++) {
			BigDecimal temp= sum;
			BigDecimal big = new BigDecimal(b[a[i]]);
			BigDecimal minusone = big.add(new BigDecimal("-1"));
			big = big.multiply(minusone);
			big = big.divide(new BigDecimal(2));
			temp = temp.add(big.multiply(new BigDecimal("-1")));
			big = new BigDecimal(b[a[i]]);
			big = big.add(new BigDecimal("-2"));
			big = big.multiply(minusone);
			big = big.divide(new BigDecimal(2));
			temp = temp.add(big);
			System.out.println(temp);
		}
	}
}