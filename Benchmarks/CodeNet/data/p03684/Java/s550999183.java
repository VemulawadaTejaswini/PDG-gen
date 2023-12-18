import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveD();
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		Map<Integer, Integer> distMap = new HashMap<>();
		Set<Integer> connectSet = new HashSet<>();
		
		connectSet.add(0);
		for (int i = 1; i < N; i++) {
			distMap.put(i, min(abs(x[0] - x[i]), abs(y[0] - y[i])));
		}
		long sumDist = 0L;
		while (connectSet.size() < N) {
			int minDist = 1000000001;
			int minIndex = 0;
			for (int i = 1; i < N; i++) {
				if (connectSet.contains(i)) {
					continue;
				}
				if (minDist > distMap.get(i)) {
					minDist = distMap.get(i);
					minIndex = i;
				}
			}
			sumDist += minDist;
			connectSet.add(minIndex);
			for (int i = 1; i < N; i++) {
				if (connectSet.contains(i)) {
					continue;
				}
				int tmpDist = min(abs(x[minIndex] - x[i]), abs(y[minIndex] - y[i]));
				if (distMap.get(i) > tmpDist) {
					distMap.put(i, tmpDist);
				}
			}
		}
		System.out.println(sumDist);
	}

	private int abs(int n) {
		return n > 0 ? n : -n;
	}

	private int min(int a, int b) {
		return a < b ? a : b;
	}
}