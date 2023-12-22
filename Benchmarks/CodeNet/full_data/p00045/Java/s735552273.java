import java.math.BigDecimal;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while(sc.hasNext()){
			n++;
			String[] temp = sc.nextLine().split(",");
			int s1 = 0;
			int s2 = 0;
			int avarage = 0;
			s1 += Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]);
			s2 += Integer.parseInt(temp[1]);
			avarage = s2 / n;
			BigDecimal bd = new BigDecimal(avarage);
			BigDecimal bd1 = bd.setScale(0, BigDecimal.ROUND_HALF_UP);
			System.out.println(s1);
			System.out.println(Integer.valueOf(avarage));
		}
	}
}