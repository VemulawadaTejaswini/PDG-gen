import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] dataSet = str.split("\n" , 0);

		for (int i = 0; Integer.parseInt(dataSet[i]) != 0; i++) {
			System.out.println("Case" + (i+1) + ": " + dataSet[i]);
		}
	}
}