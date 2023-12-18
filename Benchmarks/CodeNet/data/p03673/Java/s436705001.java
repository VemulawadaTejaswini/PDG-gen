import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Deque<Integer> deq = new ArrayDeque<Integer>(N);
		
		for (int i = 0; i < N; i++) {
			if (i % 2 == N % 2) {
				deq.offerLast(sc.nextInt());
			} else {
				deq.offerFirst(sc.nextInt());
			}
		}
		
		deq.forEach(num -> {
			System.out.print(num + " ");
		});
	}
}