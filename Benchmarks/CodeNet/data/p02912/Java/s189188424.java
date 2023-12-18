import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); int M = sc.nextInt();
		long sum = 0;
		Queue<Integer> prique = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i = 0;i < N;i++) {
			prique.add(sc.nextInt());
		}
		sc.close();
		while(M > 0) {
			prique.add(prique.poll()/2);
			M--;
		}
		for(int i : prique) {
			sum += i;
		}
		System.out.println(sum);
	}
}