import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


public class Main {

	public static void main(String[] args) throws IOException {

		  BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int sumMoney = 0;
		double sumStock = 0;
		int count = 0;
		while (true) {
            String input = buf.readLine();
            String input2 = buf.readLine();
            if (input == null || input2 == null) {
                break;
            }
            sumMoney += Integer.parseInt(input) * Integer.parseInt(input2);
            sumStock += Integer.parseInt(input2);
            count++;
        }
		double average = sumStock / count;
		BigDecimal bd = new BigDecimal(average);
		 BigDecimal bd1 = bd.setScale(0, BigDecimal.ROUND_HALF_UP);
		System.out.println(sumMoney);
		System.out.println(bd1.doubleValue());

	}

}