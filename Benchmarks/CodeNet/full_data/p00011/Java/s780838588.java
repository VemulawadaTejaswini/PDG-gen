import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.swap;

/**
 * Wrong Answer
 */
class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int w = in.nextInt();
		int n = in.nextInt();

		List<Integer> ans = new ArrayList<Integer>();
		for(int i=1;i<=w;i++) {
			ans.add(i);
		}

		String buf = in.nextLine();

		for(int i=0;i<n;i++) {
			String line = in.nextLine();
			String arr[] = line.split(",");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			swap(ans, a-1, b-1);
		}
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
	}
}