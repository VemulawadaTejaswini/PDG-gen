import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			List<Integer> ret = new ArrayList<Integer>();
			do {
				String input = br.readLine();
				if (input.equals("0")) {
					break;
				} else {
					int i, sum = 0;
					for (i = 0; i < input.length(); i++) {
						sum = sum + Integer.parseInt(input.substring(i, i + 1));
					}
					ret.add(sum);
				}
			} while (true);

			for (int num : ret) {
				System.out.println(num);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}