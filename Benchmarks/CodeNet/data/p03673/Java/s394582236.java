import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		LinkedList<Integer> b = new LinkedList<>();
		boolean head = true;

		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			if(head) {
				b.add(ai);
			}else {
				b.addFirst(ai);
			}
			head = !head;
		}
		
		Integer [] arr = b.toArray(new Integer[b.size()]);
		if(head) {
			for(int i=0; i<N-1; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println(arr[N-1]);
		}else {
			for (int i=N-1; i>0; i--) {
				System.out.print(arr[i]+" ");
			}
			System.out.println(arr[0]);
		}
		sc.close();
	}

}
