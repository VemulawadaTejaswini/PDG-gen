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

	private Integer W;
	private Integer H;
	private Integer x;
	private Integer y;
	private Integer r;

	public InputData(BufferedReader br) throws IOException {
		String line = br.readLine().trim();
		String[] values = line.split(" ");
		this.W = Integer.valueOf(values[0]);
		this.H = Integer.valueOf(values[1]);
		this.x = Integer.valueOf(values[2]);
		this.y = Integer.valueOf(values[3]);
		this.r = Integer.valueOf(values[4]);
	}

	public Integer getW() {
		return W;
	}

	public void setW(Integer W) {
		this.W = W;
	}

	public Integer getH() {
		return H;
	}

	public void setH(Integer H) {
		this.H = H;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getR() {
		return r;
	}

	public void setR(Integer r) {
		this.r = r;
	}

}

class Processing {

	private InputData inputData;

	public Processing(InputData inputData) {
		this.inputData = inputData;
	}

	public String getResult() {
		String result = null;
		if (this.inputData.getR() > this.inputData.getX() 
				|| this.inputData.getR() > this.inputData.getY() 
				|| this.inputData.getR() + this.inputData.getX() > this.inputData.getW() 
				|| this.inputData.getR() + this.inputData.getY()> this.inputData.getH()) {
			result = "No";
		} else {
			result = "Yes";
		}
		
		return result;
	}
}