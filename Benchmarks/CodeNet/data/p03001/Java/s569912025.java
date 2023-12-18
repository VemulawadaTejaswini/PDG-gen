import java.math.BigDecimal;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() { ;
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		BigDecimal W = new BigDecimal(sc.next()) ;
		BigDecimal H = new BigDecimal(sc.next()) ;
		BigDecimal x = new BigDecimal(sc.next()) ;
		BigDecimal y = new BigDecimal(sc.next()) ;

		BigDecimal s = W.multiply(H).divide(new BigDecimal("2"));

		System.out.print(s + " ");
		BigDecimal wd = W.divide(new BigDecimal("2")) ;
		BigDecimal hd = H.divide(new BigDecimal("2")) ;
		if(	x.equals(wd) &&y.equals(hd) ){
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
