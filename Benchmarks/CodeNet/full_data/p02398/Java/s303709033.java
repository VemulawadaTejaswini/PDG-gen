import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		int intJudge = 0;
		int intCount = 0;

		int inta = 0;
		int intb = 0;
		int intc = 0;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strInput = br.readLine();

			ArrayList<Integer> NumList = new ArrayList<Integer>();

			String[] strNumList = strInput.split(" ", 0);

			for (int i = 0; i < strNumList.length; i++) {
				NumList.add(Integer.parseInt(strNumList[i]));

			}

			inta = NumList.get(0);
			intb = NumList.get(1);
			intc = NumList.get(2);

			for (int i =inta ; i <= intb; i++) {
				intJudge = intc % i;
				if (intJudge == 0) {
					//?´???°???????????????
					intCount++;
				}
			}
			//???????????????
			System.out.println(intCount);

		} catch (IOException e1) {
			System.out.println(e1);
		}catch (NumberFormatException e2) {
			System.out.println(e2);
		}
	}

}