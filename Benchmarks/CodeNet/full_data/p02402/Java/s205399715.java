import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum = br.readLine();
		String numArrays = br.readLine();
		ArrayList<Integer> numArrayList = new ArrayList<Integer>();
		for (int i = 0; i < Integer.parseInt(strNum); i++) {
			numArrayList.add(Integer.parseInt(numArrays.split(" ")[i]));
		}
		Collections.sort(numArrayList);
		Integer sum = 0;
		for (int i = 0; i < numArrayList.size(); i++) {
			sum += numArrayList.get(i);
		}
		System.out.printf("%d %d %d%n",numArrayList.get(0),numArrayList.get(numArrayList.size()-1), sum);
	}
}