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

	private static final String SEPARATOR = " ";

	private List<String> rows = new ArrayList<>();
	private String row;

	private List<List> rowList = new ArrayList<>();
	
	public InputData() {
	}
	
	public void setDataFromLine(BufferedReader br) throws IOException {
		this.row = br.readLine().trim();
	}
	
	public void setDataFromLines(BufferedReader br) throws IOException {
		String line;
		while((line = br.readLine()) != null) {
			this.rows.add(line.trim());
		}
	}

	public void setValues() {
		this.rows.stream().forEach((str) -> {
			String[] values = str.split(SEPARATOR);
			List<Integer> rowValue = new ArrayList();
			rowValue.add(Integer.valueOf(values[0]));
			rowValue.add(Integer.valueOf(values[1]));
			this.rowList.add(rowValue);
		});
		
	}

	public List<List> getRowList() {
		return rowList;
	}

	public void setRowList(List<List> rowList) {
		this.rowList = rowList;
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
		for (List row : this.inputData.getRowList()) {
			Collections.sort(row);
			Integer num0 = (Integer) row.get(0);
			Integer num1 = (Integer) row.get(1);
			if (num0 == 0 && num1 == 0) {
				break;
			}
			sb.append(num0);
			sb.append(" ");
			sb.append(num1);
			sb.append(RETCODE);
		}
		result = sb.toString().trim();
		return result;
	}
}