import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List dataSet = new ArrayList();
		String str = null;
		for (int i = 0; (str = br.readLine()) != null; i++) {
			dataSet.add(str);
		}

		for (int h = 0; dataSet.size() < h; h++) {
			if (dataSet.get(h).equals(0)) {
				break;
			}
			System.out.println("Case" + (h + 1) + ": " + dataSet.get(h));
		}
	}
}