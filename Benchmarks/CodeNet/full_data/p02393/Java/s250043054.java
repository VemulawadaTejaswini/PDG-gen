import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] hikakuStr = line.split("[\\s]+");

		int a = Integer.parseInt(hikakuStr[0]);
		int b = Integer.parseInt(hikakuStr[1]);
		int c = Integer.parseInt(hikakuStr[2]);
		int[] hikakuInt = new int[3];

		hikakuInt[0] = a;
		hikakuInt[1] = b;
		hikakuInt[2] = c;
		int buf = 0;

		for (int w = 0; w < hikakuInt.length - 1; w++) {
			for (int i = 1; i < hikakuInt.length; i++) {
				if (hikakuInt[i - 1] > hikakuInt[i]) {
					buf = hikakuInt[i - 1];
					hikakuInt[i - 1] = hikakuInt[i];
					hikakuInt[i] = buf;
				}
			}
		}
		System.out
				.println(hikakuInt[0] + " " + hikakuInt[1] + " " + hikakuInt[2]);
	}
}