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

	private Integer a;
	private Integer b;
	private Integer c;

	public InputData(BufferedReader br) throws IOException {
		String line = br.readLine().trim();
		String[] values = line.split(" ");
		this.a = Integer.valueOf(values[0]);
		this.b = Integer.valueOf(values[1]);
		this.c = Integer.valueOf(values[2]);
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

	private InputData inputData;

	public Processing(InputData inputData) {
		this.inputData = inputData;
	}

	public String getResult() {
		String result = null;
		List<Integer> list = new ArrayList<>();
		list.add(this.inputData.getA());
		list.add(this.inputData.getB());
		list.add(this.inputData.getC());
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for (Integer i : list) {
			sb.append(i);
			sb.append(" ");
		}
		result = sb.toString().trim();
		return result;
	}
}