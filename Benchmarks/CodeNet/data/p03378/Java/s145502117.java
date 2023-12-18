import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		ArrayList<Integer> cost = new ArrayList<>();
		int left = 0;
		int right = 0;
		for(int i = 0; i < M; i++) {
			cost.add(Integer.parseInt(sc.next()));
			if(cost.get(i) < X) {
				left++;
			}else {
				right++;
			}
		}
		sc.close();

		System.out.println(Math.min(left, right));

	}

}
