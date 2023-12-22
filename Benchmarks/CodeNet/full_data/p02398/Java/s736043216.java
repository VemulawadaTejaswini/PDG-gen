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
			inputData.setDataFromLine(br);
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
	private Integer a;
	private Integer b;
	private Integer c;

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
		String[] values = this.row.split(SEPARATOR);
		this.setA(Integer.valueOf(values[0]));
		this.setB(Integer.valueOf(values[1]));
		this.setC(Integer.valueOf(values[2]));
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public Integer getC() {
		return c;
	}

	public void setC(Integer c) {
		this.c = c;
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
		int counter = 0;
		for (int i = this.inputData.getA(); i <= this.inputData.getB() ; i++) {
			if (this.inputData.getC() % i == 0) {
				counter++;
			}
		}
		result = String.valueOf(counter);
		return result;
	}
}