import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String word = sc.next();

		int totalCount = 0;
		for(int i = 0; i < length-1; i++) {
			String forward = word.substring(0, i+1);
			String back = word.substring(i+1, length);

			Set<String> forwardSet = new HashSet<>();
			Set<String> backSet = new HashSet<>();
			for (char cha : forward.toCharArray()) {
				forwardSet.add(String.valueOf(cha));
			}
			for (char cha : back.toCharArray()) {
				backSet.add(String.valueOf(cha));
			}


			int count = 0;
			for (String val : forwardSet) {
				if (backSet.contains(val)) {
					count++;
				}
			}
			if (count > totalCount) {
				totalCount = count;
			}

		}
		System.out.println(totalCount);

	}
}
