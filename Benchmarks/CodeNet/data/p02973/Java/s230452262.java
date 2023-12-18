import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int N = in.nextInt();
			ArrayList<Integer> lis = new ArrayList<Integer>();
			int count = 0;
			
			for (int i = 0; i < N; ++i) {
				int a = in.nextInt();
				
				int idx = Collections.binarySearch(lis, a);
				idx = Math.max(idx, -(idx + 1));
				
				if (idx >= lis.size()) {
					lis.add(a);
				} else {
					lis.set(idx, a);
				}
				
				if (idx == 0) {
					++count;
				}
			}
			
			System.out.println(count);
		}
	}

}
