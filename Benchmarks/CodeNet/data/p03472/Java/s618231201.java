
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int H = scanner.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		List<Integer> bOver = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			a[N] = scanner.nextInt();
			b[N] = scanner.nextInt();
		}
		scanner.close();
		
		int aMax = 0;
		int turn = 0;
		
		for (int i = 0; i < N; i++) {
			aMax = Integer.max(aMax, a[N]);
		}
		
		for (int i = 0; i < N; i++) {
			if (aMax < b[i]) {
				bOver.add(b[i]);
			}
		}
		
		Collections.sort(bOver, Collections.reverseOrder());
		
		for (int i = 0; i < bOver.size(); i++) {
			H = H - bOver.get(i).intValue();
			turn++;
			if (H <= 0) {
				System.out.println(turn);
				return;
			}
		}
		
		if (H % aMax != 0) {
			turn++;
		}
		turn = turn + (H / aMax);
		System.out.println(turn);
		return;
		
	}
	
}
