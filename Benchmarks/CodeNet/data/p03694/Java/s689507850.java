import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		int num;
		int maxNum;
		int minNum;
		String[] line;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		line = br.readLine().split("\\s");

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			list.add(Integer.parseInt(line[i]));
		}

		Collections.sort(list);
		maxNum = list.get(num - 1);
		minNum = list.get(0);
		System.out.println(maxNum - minNum);
	}
}
