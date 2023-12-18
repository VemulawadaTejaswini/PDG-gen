import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n == 1){
			System.out.println(2);
			return;
		}
		if(n == 2){
			System.out.println(1);
			return;
		}
		int i = 1;
		ArrayDeque<Long> queue = new ArrayDeque<>();
		queue.addFirst((long)2);
		queue.addFirst((long)1);
		Long sum;
		while(i < n){
			sum = (long)0;
			sum += queue.getFirst() + queue.getLast();
			queue.addFirst(sum);
			queue.removeLast();
			i++;
		}
		System.out.println(queue.getFirst());
	}

}
