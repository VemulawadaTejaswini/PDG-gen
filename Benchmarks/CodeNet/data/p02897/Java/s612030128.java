import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String n =sc.next();
		int m = Integer.parseInt(n);
		int cnt = 0;
		for (int i = 1; i <= m;i++) {
			if(i%2 ==1) {
				cnt++;
			}
		}
		BigDecimal bdcnt = new BigDecimal(cnt);
		BigDecimal bdm = new BigDecimal(m);
		BigDecimal ans = bdcnt.divide(bdm,10,RoundingMode.HALF_UP);
		System.out.println("" +  ans);
      
      
	}

}