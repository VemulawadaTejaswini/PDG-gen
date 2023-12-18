import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i< N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		int distance = 0;
		for(int i = 0; i< N; i++) {
			int x = list.get(i);
			if(2 * x < K) {
				distance += 2 * x;
			}else {
				distance += 2 * (K - x);
			}
		}
		System.out.println(distance);

	}
}