import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class CopyOfMain {

	public static void main(String[] a){

		String str;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(null != ( str = bf.readLine() )){
				String[] arr = str.split(" ");
				BigDecimal ansX = new BigDecimal(
						(Integer.parseInt(arr[2]) * Integer.parseInt(arr[4]) - Integer.parseInt(arr[5]) * Integer.parseInt(arr[1])) /
						(Integer.parseInt(arr[0]) * Integer.parseInt(arr[4]) - Integer.parseInt(arr[1]) * Integer.parseInt(arr[3])));
				BigDecimal ansY = new BigDecimal(
						(Integer.parseInt(arr[2]) * Integer.parseInt(arr[3]) - Integer.parseInt(arr[0]) * Integer.parseInt(arr[5])) /
						(Integer.parseInt(arr[1]) * Integer.parseInt(arr[3]) - Integer.parseInt(arr[0]) * Integer.parseInt(arr[4])));
				System.out.println(ansX.setScale(3, BigDecimal.ROUND_UP) + " " + ansY.setScale(3, BigDecimal.ROUND_UP));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
			}
		}
	}
}