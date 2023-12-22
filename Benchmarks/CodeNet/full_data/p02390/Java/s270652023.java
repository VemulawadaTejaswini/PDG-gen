import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		String strInput = null;

		int intTime = 0;


		try {
			BufferedReader strLine = new BufferedReader(new InputStreamReader(System.in));
			strInput = strLine.readLine();

			intTime = Integer.parseInt(strInput);

			//??\?????°???????????§??????
			int h = 0;
			int m = 0;
			int s = 0;

			if (intTime > 0 && intTime < 86400) {

				h = intTime / 3600;

				m = (intTime % 3600) / 60;

				s = (intTime % 3600) % 60;
				//???????????????
			System.out.println(h + ":" + m + ":" + s);
			}
			//
		} catch (IOException e1) {
			System.out.println(e1);
		}catch (NumberFormatException e2) {
			System.out.println(e2);
		}
	}

}