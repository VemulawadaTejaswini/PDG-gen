import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		int intx = 0;

		try {
			for (int i = 1; i < 10000; i++) {

				//??\????????????
				BufferedReader strLine = new BufferedReader(new InputStreamReader(System.in));
				String strInput = strLine.readLine();

				intx = Integer.parseInt(strInput);

				if (1 <= intx && intx <= 10000) {

					//??????
					System.out.println("Case " +  i + ": " + intx);
				}else{
					break;
				}
			}
		}catch (IOException e1) {
			System.out.println(e1);
		}catch (NumberFormatException e2) {
			System.out.println(e2);
		}
	}

}