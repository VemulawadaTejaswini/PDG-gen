
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		PriorityQueue<Long> l = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Long> r = new PriorityQueue<>();
		int Q=sc.nextInt();
		long b=0;
		for(int i=0; i<Q; i++) {
			int q=sc.nextInt();
			if(q==1) {
				long a=sc.nextLong();
				b+=sc.nextLong();
				l.add(a);
				r.add(a);
				if(l.element()>r.element()) {
					long v1=l.poll();
					long v2=r.poll();
					l.add(v2);
					r.add(v1);
				}
			}else {
				System.out.println(l.element()+ " " + (Math.abs(l.element()-r.element()) + b));
			}
		}
		sc.close();
	}


}
