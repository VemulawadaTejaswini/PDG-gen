import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
 class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		int size = Integer.parseInt(bufferedReader.readLine());
		List<String> strings = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			String order[] = bufferedReader.readLine().split(" ");
			if (order[0].charAt(0) == 'i') {
				strings.add(order[1]);
			} else {
				if (strings.stream().anyMatch(e -> e.equals(order[1]))) {
					stringBuilder.append("yes\n");
				} else {
					stringBuilder.append("no\n");
				}
			}
		}
		System.out.println(stringBuilder.toString());
	}

}