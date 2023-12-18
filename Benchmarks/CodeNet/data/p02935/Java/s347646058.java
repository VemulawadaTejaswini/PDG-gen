import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		PriorityQueue<Double> PQ = new PriorityQueue<Double>();
		for(int i = 0;i < N;i++) {
			PQ.add(scn.nextDouble());
		}
		double ans = PQ.poll();
		while(!PQ.isEmpty()) {
			ans += PQ.poll();
			ans /= 2;
		}
		System.out.println(ans);
	}

}
