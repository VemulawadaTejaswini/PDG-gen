import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		String[] str = br.readLine().split(" ");
		int x1 = Integer.parseInt(str[0]);
		int x2 = Integer.parseInt(str[2]);
		int y1 = Integer.parseInt(str[1]);
		int y2 = Integer.parseInt(str[3]);
		double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		BigDecimal bd = new BigDecimal(distance);
		BigDecimal bd2 = bd.setScale(8, BigDecimal.ROUND_HALF_UP);
		System.out.println(bd2.doubleValue());

	}
}