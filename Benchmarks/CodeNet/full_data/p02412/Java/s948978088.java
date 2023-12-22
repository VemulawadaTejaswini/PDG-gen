import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> answer = new ArrayList<Integer>();
		int count = 0 ;
		while (true) {
			String line = br.readLine();
			if ("0 0".equals(line)) {
				break;
			}
			String[] inputData = line.split(" ");
			int n = Integer.parseInt(inputData[0]);
			int x = Integer.parseInt(inputData[1]);

			count = 0;
			for (int i =1; i< n-1 && i < x; i++) {
				for (int j = i + 1; j < n && j < x; j++) {
					for (int k = j + 1; k < n + 1 && k < x; k++) {
						if ((i + j + k) == x) {
							count++;
						}
					}
				}
			}
			answer.add(count);
		}

		for(int output : answer) {
			System.out.println(output);
		}
	}
}