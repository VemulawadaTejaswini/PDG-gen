import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputArgs = getInputArgs(br);
		int arrayNum = Integer.parseInt(inputArgs[0]);

		inputArgs = getInputArgs(br);
		int[] numArray = new int[arrayNum];

		for (int i = 0; i < arrayNum; i++) {
			numArray[i] = Integer.parseInt(inputArgs[i]);
		}

		for (int j = 1; j < numArray.length; j++) {
			int key = numArray[j];
			int i = j - 1;
			while (i >= 0 && numArray[i] > key) {
				numArray[i + 1] = numArray[i];
				i = i - 1;
			}
			numArray[i + 1] = key;
			System.out.println(Arrays.toString(numArray).replaceAll(
					"[,\\[\\]]", ""));
		}
	}

	private static String[] getInputArgs(BufferedReader br) throws IOException {
		String line = br.readLine();
		String[] splitLine = line.split("\\s");
		return splitLine;
	}
}