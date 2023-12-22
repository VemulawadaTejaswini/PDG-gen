
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yoshkur
 */
public class AizuOnlineJudge {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			InputData inputData = new InputData(br);
			System.out.println(getResult(inputData));

		} catch (IOException | NumberFormatException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}

	public static String getResult(InputData inputData) {
		String result = null;
		if (inputData.getA() < inputData.getB()
				&& inputData.getB() < inputData.getC()) {
			result = "Yes";
		} else {
			result = "No";
		}
		return result;
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