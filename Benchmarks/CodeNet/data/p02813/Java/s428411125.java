import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();

		List<String> allPermList = permutation(n, "", new ArrayList<>());

		Collections.sort(allPermList);

		stdIn.nextLine(); //改行

		String p = stdIn.nextLine().replaceAll(" ", "");
		String q = stdIn.nextLine().replaceAll(" ", "");

		int index = 0;
		int pIndex = -1;
		int qIndex = -1;

		for (String seq : allPermList) {
			if(p.equals(seq)) {
				pIndex = index;
			}

			if(q.equals(seq)) {
				qIndex = index;
			}

			if(pIndex != -1 && qIndex != -1) {
				break;
			}

			index++;

		}

		System.out.println((int)Math.abs(pIndex - qIndex));

		stdIn.close();
	}

	public static List<String> permutation(int n, String current, List<String> results) {

		if (current.length() == n) {
			results.add(current);
			return results;
		}

		int digit = current.length() + 1;

		for (int i = 0; i < digit; i++) {
			StringBuilder sb = new StringBuilder().append(current);
			sb.insert(i, digit);

			permutation(n, sb.toString(), results);
		}

		return results;
	}
}
