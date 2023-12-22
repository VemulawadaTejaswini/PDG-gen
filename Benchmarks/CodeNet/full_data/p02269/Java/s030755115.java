import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
 class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		int size = Integer.parseInt(bufferedReader.readLine());
//		List<String> strings = new ArrayList<>();
		HashSet<String> strings = new HashSet<>();
		for (int i = 0; i < size; i++) {
			String order = bufferedReader.readLine();
			if (order.charAt(0) == 'i') {
				strings.add(order.substring(7));
			} else {
				if (strings.stream().anyMatch(e -> e.equals(order.substring(5)))) {
					stringBuilder.append("yes\n");
				} else {
					stringBuilder.append("no\n");
				}
			}
		}
		System.out.print(stringBuilder.toString());
	}

}