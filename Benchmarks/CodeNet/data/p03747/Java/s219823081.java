import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveC();
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int T = sc.nextInt();
		int offset = L;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int d = sc.nextInt();
			int g = x + T * (3 - d * 2);
			list.add(g);
			if (offset > g) {
				offset = g;
			}
		}
		List<Integer> relativeList = new ArrayList<Integer>();
		int index = 0;
		for (int x : list) {
			relativeList.add((x - offset) % L);
			if (x - offset >= L) {
				index += (x - offset) / L;
			}
		}
		Collections.sort(relativeList);
		for (int x : relativeList.subList(index, N)) {
			System.out.println((((x + offset) % L) + L) % L);
		}
		for (int x : relativeList.subList(0, index)) {
			System.out.println((((x + offset) % L) + L) % L);
		}
	}
}