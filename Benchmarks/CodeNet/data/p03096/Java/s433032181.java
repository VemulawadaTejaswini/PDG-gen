import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.valueOf(scan.nextLine()).intValue();
		String[] colors = new String[n];
		for (int i = 0; i < n; i++) {
			colors[i] = scan.next();
		}

		int cnt = 1;
		List<Integer> startList = new ArrayList<Integer>();
		List<Integer> endList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			String baseColor = colors[i];
			for (int j = i + 2; j < n; j++) {
				if (baseColor.equals(colors[j])) {
					startList.add(i);
					endList.add(j);
					cnt++;
					break;
				}
			}
		}
		
		for (int i = 0; i < endList.size(); i++) {
			int end = endList.get(i);
			for (int j = i + 1; j < startList.size(); j++) {
				int start = startList.get(j);
				if (start >= end) {
					cnt++;
				}
			}
		}

		System.out.println(cnt % (10 * 9 + 7));
	}
}
