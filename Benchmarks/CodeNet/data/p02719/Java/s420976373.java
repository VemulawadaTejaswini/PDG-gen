import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		Long k = sc.nextLong();
		Long min = Math.min(n, k);
		Long max = Math.max(n, k);
		Long mod = max%min;
		if(min == 1 || n==k) {
			System.out.println(0);
		}
		else {
			Long ans = Math.abs(mod-min);
			System.out.println(ans);
		}
	}
}