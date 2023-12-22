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
			InputData inputData = new InputData();
			inputData.setDataFromLines(br);
			inputData.setValues();
			Processing processing = new Processing(inputData);
			System.out.println(processing.getResult());

		} catch (IOException | NumberFormatException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}

class InputData {

	public static final String SEPARATOR = " ";

	private List<String> rows = new ArrayList<>();
	private String row;

	public InputData() {
	}

	public void setDataFromLine(BufferedReader br) throws IOException {
		this.row = br.readLine().trim();
	}

	public void setDataFromLines(BufferedReader br) throws IOException {
		String line;
		while ((line = br.readLine()) != null) {
			this.rows.add(line.trim());
		}
	}

	public void setValues() {

	}

	public List<String> getRows() {
		return rows;
	}

	public void setRows(List<String> rows) {
		this.rows = rows;
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
		for (String str : this.inputData.getRows()) {
			String[] values = str.split(InputData.SEPARATOR);
			Integer num0 = Integer.valueOf(values[0]);
			Integer num1 = Integer.valueOf(values[1]);
			if (num0 == 0 && num1 == 0) {
				break;
			}
			if (num0 > num1) {
				Integer temp = num0;
				num0 = num1;
				num1 = temp;
			}
			
			sb.append(num0);
			sb.append(InputData.SEPARATOR);
			sb.append(num1);
			sb.append(RETCODE);
		}
		result = sb.toString().trim();
		return result;
	}
}