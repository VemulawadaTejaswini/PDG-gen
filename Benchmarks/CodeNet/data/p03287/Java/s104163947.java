import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Unit> queue = new PriorityQueue<>();
		PriorityQueue<Unit> next = new PriorityQueue<>();
		queue.add(new Unit(0, 1));
		long answer = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    while (queue.size() > 0) {
		        Unit u = queue.poll();
		        int key = u.key;
		        long value = u.value;
		        while (queue.size() > 0 && queue.peek().key == key) {
		            value += queue.poll().value;
		        }
		        int nextkey = (key + x) % m;
		        if (nextkey == 0) {
		            answer += value;
		        }
		        next.add(new Unit(nextkey, value));
		    }
		    next.add(new Unit(0, 1));
		    PriorityQueue<Unit> tmp = next;
		    next = queue;
		    queue = tmp;
		}
		System.out.println(answer);
    }
    
    static class Unit implements Comparable<Unit> {
        int key;
        long value;
        
        public Unit(int key, long value) {
            this.key = key;
            this.value = value;
        }
        
        public int compareTo(Unit another) {
            return key - another.key;
        }
    }
}

