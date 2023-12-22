
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if(n==0)
				break;
			Pair[] pairs = new Pair[n];
			for(int i = 0;i<n;i++){
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int c = scanner.nextInt();
				pairs[i] = new Pair(a, b+c);
			}
			Arrays.sort(pairs);
			System.out.println(pairs[0].id+" " + pairs[0].cost);
		}
	}
	class Pair implements Comparable<Pair>{
		int id;
		int cost;
		
		public Pair(int id, int cost) {
			super();
			this.id = id;
			this.cost = cost;
		}

		@Override
		public int compareTo(Pair o) {
			return o.cost-this.cost;
		}
		
	}
}