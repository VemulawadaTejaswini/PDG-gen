import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		
	}
}