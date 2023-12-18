import java.util.*;

public class Main {

	private static final double RATE = 380000.0;

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		double totalAmtJpy = 0;
		
		for(int i=0; i<N; i++) {
			String amtString = sc.next();
			String currency = sc.next();
			if(currency.equals("JPY")){
				totalAmtJpy += (double)Integer.parseInt(amtString);
			}else if (currency.equals("BTC")){
				double btc = Double.parseDouble(amtString);
				totalAmtJpy += btc * RATE;
			}else {
				throw new IllegalArgumentException();
			}
		}
		
		System.out.println(totalAmtJpy);
		sc.close();
	}

}