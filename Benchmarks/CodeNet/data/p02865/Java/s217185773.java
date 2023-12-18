import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int culc = (n - 1) / 2;
		BigDecimal culc2 = BigDecimal.valueOf(culc).setScale(0, RoundingMode.UP);
		
		System.out.println(culc2);
		sc.close();
	}
}