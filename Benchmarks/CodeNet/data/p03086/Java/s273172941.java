import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split("");
		int[] count = new int[str.length + 1];
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("A") || str[i].equals("T") || str[i].equals("C") || str[i].equals("G")) {
				count[i+1] = count[i] + 1;
			}
			//if (i+1-count[i+1] != i-count[i]) {
			else {
				list.add(count[i]);
			}
		}
		int max = Collections.max(list);
		System.out.println(max);
	}
}