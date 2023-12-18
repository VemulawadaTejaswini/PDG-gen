
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> visit = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			visit.add(sc.nextInt());
		}
		Collections.sort(visit);
		List<Integer> diff = new ArrayList<>();
		for(int i = 0; i < M - 1; i++) {
			diff.add(visit.get(i + 1) - visit.get(i));
		}
		Collections.sort(diff);
		int count = M - N;
		int ans = 0;
		while(count > 0) {
			ans += diff.get(0);
			diff.remove(0);
			count--;
		}
		System.out.println(ans);
	}

}
