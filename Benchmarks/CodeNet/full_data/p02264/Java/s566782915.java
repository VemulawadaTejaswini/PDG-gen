import java.util.*;

public class Main {
	public static void main(String[] args) {
		ALDS1_3_B();
	}

	public static void ALDS1_3_B() {

		class Pair{
			private String name;
			private int time;
			
			public Pair(String name, int time) {
				this.name = name;
				this.time = time;
			}

			String getName(){
				return this.name;
			}

			int getTime(){
				return this.time;
			}
		}

		Scanner sc = new Scanner(System.in);
		Queue<Pair> que = new LinkedList<Pair>();
		int n = sc.nextInt();
		int q = sc.nextInt();
		String[] name = new String[n];
		int[] time = new int[n];
		int[] timeAns = new int[n];
		int ans = 0;
		Arrays.fill(timeAns, 0);
		for(int i = 0; i < n; i++) {
			name[i] = sc.next();
			time[i] = sc.nextInt();
			Pair pair = new Pair(name[i], time[i]);
			que.add(pair);
		}

		Pair pair;
		while((pair = que.poll()) != null) {
			if(pair.getTime() - q > 0) {
				Pair tmp = new Pair(pair.getName(), pair.getTime() - q);
				que.add(tmp);
				ans += q;
			}else {
				System.out.println(pair.getName() + " " + (pair.getTime() + ans));
				ans += pair.getTime();
			}
		}
	}
	
}

