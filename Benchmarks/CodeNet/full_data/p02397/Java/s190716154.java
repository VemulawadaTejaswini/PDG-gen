import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum = "";
		ArrayList<String> numList = new ArrayList<String>();
		while (true) {
			strNum = br.readLine();
			if ("0 0".equals(strNum)) {
				break;
			}
			String[] numArrays = strNum.split(" ");
			if (Integer.parseInt(numArrays[0]) > Integer.parseInt(numArrays[1])) {
				numList.add(numArrays[1] + " " + numArrays[0]);
			} else {
				numList.add(numArrays[0] + " " + numArrays[1]);
			}
		}
		for (int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));
		}
	}

}