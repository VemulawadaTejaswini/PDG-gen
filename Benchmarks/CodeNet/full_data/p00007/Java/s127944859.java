import java.util.Scanner;
import java.math.BigDecimal;
public class Main{
	static int calculate(int yen){
		BigDecimal bd = new BigDecimal(yen*1.05);
		BigDecimal bd1 = bd.setScale(-3, BigDecimal.ROUND_UP);
		return bd1.intValue();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int yen = 100000;
		for(int i=0;i<n;i++){
			yen =calculate(yen);
		}
		System.out.println(yen);
		scan.close();
	}
}