import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		List<Integer> yenList = new ArrayList<>();
		for (int i=0; i<N; i++) {
			yenList.add(sc.nextInt());
		}
		
		Collections.sort(yenList);

		for (int i=0; i<M; i++) {
			Integer yen = yenList.remove(N - 1) / 2;
			if (yenList.isEmpty() || yenList.get(0) >= yen) {
				yenList.add(0, yen);
			}
			else {
				for (int j=1; j<N; j++) {
					if (yenList.get(N - 1 - j) < yen) {
						yenList.add(N - j, yen);
						break;
					}
				}
			}
		}

		long sum = 0;
		for (Integer yen : yenList) {
			sum += yen;
		}
		System.out.println(sum);
	}
}