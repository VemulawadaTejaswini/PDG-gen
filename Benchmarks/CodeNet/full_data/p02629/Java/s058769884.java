import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		BigDecimal N = new BigDecimal(S);

		int count = 1;
		int checkCount = 1;
		int tmp = 0;
		while(true) {
			BigDecimal value = BigDecimal.valueOf((int)Math.pow(26, checkCount));
			if(N.subtract(value).intValue() > 0) {
				N = N.subtract(value);
				checkCount++;
				count++;
			}else {
				tmp = N.intValue();
				break;
			}
		}
		

		StringBuffer sb = new StringBuffer();
		for(int i = 1; i <= count;i++) {
			char ch = 'a';
			long che = tmp - (int) Math.pow(26, count - i);
			long tmpCount = 0;
			while(che > 0) {
				ch++;
				che -= (int) Math.pow(26, count - i);
				tmpCount++;
			}
			sb.append(ch);
			tmp -= tmpCount * (int) Math.pow(26, count - i);
		}
		System.out.println(sb.toString());

	}

}