import java.util.Scanner;

/**
 * Class Untitled
 */
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//合計金額
		double total = 0;
		//お年玉を貰った人数
		int peaple = Integer.parseInt(scan.next());
		for(int x = 0; x < peaple; x++){
			//金額
			double money = Double.parseDouble(scan.next());
			//通貨
			String currency = scan.next();
			if(currency.equals("JPY")){
				total += money;
			}else if(currency.equals("BTC")){
				total += money * 380000.0;
			}
		}
		System.out.printf("%.10f", total);
	}
}