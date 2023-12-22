import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		BigDecimal c = sc.nextBigDecimal();
		
		int[] d = new int[a];
		int[] e = new int[b];
 
		for (int i = 0; i < a; i++) {
			d[i] = sc.nextInt();
		}
 
		for (int i = 0; i < b; i++) {
			e[i] = sc.nextInt();
		}
		
		int n = 0;
		int m = 0;
		
		int saidaisu = 0;
		
		BigDecimal gokei = new BigDecimal("0");
		
		while (gokei.compareTo(c) < 0) {
			if ((n < a && m < b && d[n] < e[m] && gokei.add(new BigDecimal(d[n])).compareTo(c) < 0)
					|| (n < a && m >= b && gokei.add(new BigDecimal(d[n])).compareTo(c) <= 0)) {
				gokei = gokei.add(new BigDecimal(d[n]));
				n++;
				saidaisu++;
			} else if ((n < a && m < b && d[n] > e[m] && gokei.add(new BigDecimal(e[m])).compareTo(c) < 0)
					|| (m < b && n >= a && gokei.add(new BigDecimal(e[m])).compareTo(c) <= 0)) {
				gokei = gokei.add(new BigDecimal(e[m]));
				m++;
				saidaisu++;
			} else {
				break;
			}
		}
		System.out.println(saidaisu);
	}
}