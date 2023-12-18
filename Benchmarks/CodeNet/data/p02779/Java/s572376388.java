import java.util.*;

class Main {
	Scanner sc;
	int N;
	Set<Integer> s;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		s = new HashSet<Integer>(200000);
		boolean contains = false;
		for (int i = 0; i < N; i++) {
			if (!s.add(sc.nextInt())) contains = true;
		}
		System.out.println(contains?"NO":"YES");
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
