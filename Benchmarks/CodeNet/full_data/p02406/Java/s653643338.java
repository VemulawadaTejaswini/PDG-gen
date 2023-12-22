import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(br.readLine());
		ArrayList<Integer> numArrays = new ArrayList<Integer>();
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				numArrays.add(i);
			} else if (i % 10 == 3) {
				numArrays.add(i);
			}
		}
		String out = "";
		for (int i = 0; i < numArrays.size(); i++) {
			out += numArrays.get(i) + " ";
		}
		System.out.print(out.subSequence(0, out.length() - 1));
	}

}