import java.util.Arrays;
import java.util.Scanner;

class State implements Comparable<State>{
	int P, Y, id;
	public State(int p, int y, int i) {
		P = p; Y = y; id = i;
	}

	public int compareTo(State o) {
		return Y - o.Y;
	}
}

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int[] city_count = new int[N];
		State[] new_city = new State[M];
		String[] ans = new String[M];
		Arrays.fill(city_count, 0);
		for(int i = 0; i < M; i++) {
			int P = sc.nextInt(), Y = sc.nextInt();
			new_city[i] = new State(P, Y, i + 1);
		}
		Arrays.sort(new_city);
		for(State s : new_city) {
			city_count[s.P - 1]++;
			//make string
			String forward = String.format("%06d", s.P);
			String backward = String.format("%06d", city_count[s.P - 1]);
			ans[s.id - 1] = forward.concat(backward);
		}
		for(String str : ans) System.out.println(str);
	}
}
