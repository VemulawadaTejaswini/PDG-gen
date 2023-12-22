import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String output = "";
		List<String> input = new ArrayList<String>();
		while (line != null) {
			// CTRL+Z??§??\????????????
			input.add(line);

			line = br.readLine();
		}
		boolean isFirstRow = true;
		for (String inputLine : input) {
			if (!isFirstRow) {
				System.out.println();
			}
			String[] inputData = inputLine.split(" ");
			int startYear = Integer.parseInt(inputData[0]);
			int endYear = Integer.parseInt(inputData[1]);
			if (startYear == 0 && endYear == 0) {
				break;
			}
			boolean isEmpty = true;
			for (int i = startYear; i <= endYear; i++) {
				if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
					System.out.println(i);
					isEmpty = false;
				}
			}
			if (isEmpty) {
				System.out.println("NA");
			}
			isFirstRow = false;
		}
    }

}