import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int num = 0;
		Map<Integer, Integer> inputMap = new LinkedHashMap<Integer, Integer>();
		String[] input = br.readLine().split(" ");
		for (int i = 0; i < size; i++) {
			num = Integer.parseInt(input[i]);
			if (inputMap.containsKey(num)) {
				inputMap.put(num, inputMap.get(num) + 1);
			} else {
				inputMap.put(num, 1);
			}
		}
		size = Integer.parseInt(br.readLine());
		input = br.readLine().split(" ");
		int sum = 0;
		for (int i = 0; i < size; i++) {
			num = Integer.parseInt(input[i]);
			if (inputMap.containsKey(num)) {
				sum += inputMap.get(num);
			}
		}
		System.out.println(sum);
	}
}