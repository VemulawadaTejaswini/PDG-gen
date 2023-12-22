import java.util.Scanner;
import java.math.BigDecimal;
public class Main{
	private int first;
	Main(int yen){
		first = yen;
	}
	int calculate(int yen){
		BigDecimal bd = new BigDecimal(yen*1.05);
		BigDecimal bd1 = bd.setScale(-4, BigDecimal.ROUND_HALF_UP);
		return bd1.intValue();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	 　　　　Main Deb = new Main(100000);
		int n = scan.nextInt();
		int yen = 100000;
		for(int i=0;i<n-2;i++){
			yen =Deb.calculate(yen);
		}
		System.out.println(yen);
		scan.close();
	}
}