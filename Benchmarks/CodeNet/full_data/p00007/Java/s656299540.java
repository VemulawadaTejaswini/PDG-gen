import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		int period = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int val = 100;//壱百千円
		double exactVal;
		for (; 0 < period; period--) {
			exactVal = val * 1.05;
			val = (int) (exactVal - (int) exactVal > 0 ? exactVal + 1 : exactVal);
		}
		System.out.println(val * 1000);
	}
}