import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BigDecimal debt = new BigDecimal(100000);
		BigDecimal kinri = new BigDecimal(1.05);
		int week = scan.nextInt();
		
		for(int i = 1;i<=week;i++){
			debt = debt.multiply(kinri);
			debt = debt.setScale(-3,BigDecimal.ROUND_UP);
		}
		
		int ans = debt.intValue();		
		System.out.println(ans);
	}
}