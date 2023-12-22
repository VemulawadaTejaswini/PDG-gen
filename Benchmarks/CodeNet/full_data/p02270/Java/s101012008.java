import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(-(scan.nextInt()));
		}
		
		Collections.sort(list);
		
		int[] wg = new int[k];
		for (int i = 0; i < k && list.size() > 0; i++) {
			wg[i] -= list.get(0);
			list.remove(0);
		}
		
		while (list.size() > 0) {
			Arrays.sort(wg);
			wg[0] -= list.get(0);
			list.remove(0);
		}

		Arrays.sort(wg);
		System.out.println(wg[k-1]);

		scan.close();
	}

}