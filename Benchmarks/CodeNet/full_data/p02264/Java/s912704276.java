import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int q = stdIn.nextInt();

		Queue<String> queP = new LinkedList<String>();
		Queue<Integer> queT = new LinkedList<Integer>();

		int timeCount = 0;

		for (int i=0; i<n; i++) {
			queP.add(stdIn.next());
			queT.add(stdIn.nextInt());
		}

		while (queP.size() != 0) {
			if (queT.peek() - q >0) {
				queP.add(queP.poll());
				queT.add(queT.poll()-q);
				timeCount += q;
			}else {
				timeCount += queT.poll();
				System.out.println(queP.poll()+" "+timeCount);
			}
		}
	}
}