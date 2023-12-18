import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());
		ArrayList<Integer> cost = new ArrayList<>();
		ArrayList<Integer> time = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			cost.add(Integer.parseInt(sc.next()));
			time.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		int ansCost = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			if(time.get(i) <= T) {
				ansCost = Math.min(ansCost, cost.get(i));
			}
		}
		if(ansCost == Integer.MAX_VALUE) {
			System.out.println("TLE");
		}else {
			System.out.println(ansCost);
		}

	}
}