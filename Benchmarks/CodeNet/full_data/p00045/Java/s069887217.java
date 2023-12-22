import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {

		  BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int sumMoney = 0;
		int sumStock = 0;
		int count = 0;
		while (true) {
            String input = buf.readLine();
            if (input == null) {
                break;
            }
            String[] temp = input.split(",");
            sumMoney += Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]);
            sumStock += Integer.parseInt(temp[1]);
            count++;
        }
		int average = sumStock / 3;
		System.out.println(sumMoney);
		System.out.println(average);

	}

}