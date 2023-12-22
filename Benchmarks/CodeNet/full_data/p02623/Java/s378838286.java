import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		double k = Double.parseDouble(sc.next());
		Deque<Double> nlist = new ArrayDeque<Double>();
		Deque<Double> mlist = new ArrayDeque<Double>();
		for(int i = 0; i < n; i++) {
			nlist.push(Double.parseDouble(sc.next()));
		}
		for(int i = 0; i < m; i++) {
			mlist.push(Double.parseDouble(sc.next()));
		}
		sc.close();
		double sum = 0;
		double count = 0;
		while(true) {
			if(!nlist.isEmpty() && !mlist.isEmpty()) {
				sum += nlist.peekLast() > mlist.peekLast() ? mlist.pop():nlist.pop();
			}else if(!nlist.isEmpty()) {
				sum += nlist.pop();
			}else if(!mlist.isEmpty()) {
				sum += mlist.pop();
			}else {
				break;
			}

			if(sum <= k) {
				count++;
			}else {
				break;
			}

		}
		System.out.print(String.format("%.0f", count));

	}
}