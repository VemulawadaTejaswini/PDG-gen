import java.math.BigDecimal;
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int count = 0;
		BigDecimal div = new BigDecimal(2019);
		BigDecimal zero = new BigDecimal(0);
		for (int i = 0; i < N.length() - 4; i++) {
			for (int j = i + 5; j <= N.length() ; j++) {
				String s = N.substring(i, j);
				BigDecimal bd = new BigDecimal(s);
				BigDecimal res = bd.remainder(div);
				if(res.equals(zero)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}