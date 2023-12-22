import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String dataSet = br.readLine();

			while (Integer.valueOf(dataSet) != 0) {
				int answer = 0;
				for(Integer i = 0;  i < dataSet.length(); i++){
					char c = dataSet.charAt(i);
					answer += Character.getNumericValue(c);
				}
				System.out.println(answer);
				dataSet = br.readLine();
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}