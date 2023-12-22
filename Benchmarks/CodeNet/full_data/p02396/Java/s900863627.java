import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		ArrayList list = new ArrayList<>();

		for (int i = 0; i < 9999; i++) {
			list.add(br.readLine());
			if ("0".equals(list.get(i))) {
				for (int j = 1; j < list.size(); j++) {
					System.out.println("Case "+j+": "+list.get(j-1));
				}
				break;
			}
		}
	}
}