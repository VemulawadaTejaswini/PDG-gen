import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		int[] numList = new int[6];
		String[] inputList;

		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String line = "";
			do{
				line = br.readLine();
				if (line == null || line.length() == 0) {
					break;
				}
				inputList = line.split(" ");
				//??°???5???????????????(roop)
				for (int i = 0; i < 6; i++) {
					numList[i] = Integer.parseInt(inputList[i]);
				}

				//X????¨????
				double numX = (numList[2] * numList[4] - numList[1] * numList[5])
						/(numList[0] * numList[4] - numList[1] * numList[3]);
				String X = String.format("%.3f", numX);

				//Y????¨????
				double numY = (numList[5] - numList[3] * numX) / numList[4];
				String Y = String.format("%.3f", numY);

				//???????????????(?°???°?¬¬?????? ?????¨?????\)
				System.out.println(X + " " + Y);
			}while (line != null && line.length() != 0);

		}catch (Exception e) {
			System.out.println(e);
		} finally {
			if (isr != null) {
				try {
					isr.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

}