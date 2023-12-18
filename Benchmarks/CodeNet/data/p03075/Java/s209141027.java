import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		List<Integer> positions = new ArrayList<>();
		for (int i = 0; i < 5; ++i) {
			positions.add(Integer.parseInt(in.readLine()));
		}
		int K = Integer.parseInt(in.readLine());
		in.close();

		int count = 0;
		for (int i = 0; i < positions.size(); ++i) {
			for (int j = 0; j < positions.size(); ++j) {
				if (positions.get(j) - positions.get(i) > K) {
					++count;
				}
			}
		}
		if(count > 0) {
			System.out.println(":(");
		}else {
			System.out.println("Yay!");
		}

	}

}
