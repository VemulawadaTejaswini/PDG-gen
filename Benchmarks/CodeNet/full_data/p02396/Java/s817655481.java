/*
 * Aizu Online Judge
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author yoshkur
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			InputData inputData = new InputData(br);
			Processing processing = new Processing(inputData);
			System.out.println(processing.getResult());

		} catch (IOException | NumberFormatException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}

class InputData {

	private List<Integer> numberList = new ArrayList<>();

	public InputData(BufferedReader br) throws IOException {
		String line;
		while((line = br.readLine()) != null) {
			this.numberList.add(Integer.valueOf(line.trim()));
		}
	}

	public List<Integer> getNumberList() {
		return numberList;
	}

	public void setNumberList(List<Integer> numberList) {
		this.numberList = numberList;
	}

}

class Processing {
	private static final String RETCODE = System.getProperty("line.separator");

	private InputData inputData;

	public Processing(InputData inputData) {
		this.inputData = inputData;
	}

	public String getResult() {
		String result = null;
		StringBuilder sb = new StringBuilder();
		for (int i = 0;
				i < this.inputData.getNumberList().size() 
				&& this.inputData.getNumberList().get(i) != 0;
				i++) {
			sb.append("Case ");
			sb.append(i + 1);
			sb.append(": ");
			sb.append(this.inputData.getNumberList().get(i));
			sb.append(RETCODE);
		}
		result = sb.toString().trim();
		return result;
	}
}