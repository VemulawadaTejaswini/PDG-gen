import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int num = 0;
		Map<Integer, Boolean> inputMap = new LinkedHashMap<Integer, Boolean>();
		String[] inputNums = br.readLine().split(" ");
		for (int i = 0; i < size; i++) {
			num = Integer.parseInt(inputNums[i]);
			if (!inputMap.containsKey(num)) {
				inputMap.put(num, true);
			}
		}

		size = Integer.parseInt(br.readLine());
		inputNums = br.readLine().split(" ");
		int sum = 0;
		for (int i = 0; i < size; i++) {
			num = Integer.parseInt(inputNums[i]);
			if (inputMap.containsKey(num)) {
				sum += 1;
			}
		}
		System.out.println(sum);
	}
}