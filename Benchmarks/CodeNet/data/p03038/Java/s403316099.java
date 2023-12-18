import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
		    queue.add(sc.nextInt());
		}
		Change[] changes = new Change[m];
		for (int i = 0; i < m; i++) {
		    changes[i] = new Change(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(changes);
		long total = 0;
		for (Change x : changes) {
		    if (queue.size() == 0 || queue.peek() > x.value) {
		        break;
		    }
		    for (int i = 0; i < x.times; i++) {
		        if (queue.size() == 0 || queue.peek() > x.value) {
		            break;
		        }
		        total += x.value;
		        queue.poll();
		    }
		}
		while (queue.size() > 0) {
		    total += queue.poll();
		}
		System.out.println(total);
	}

    static class Change implements Comparable<Change> {
        int value;
        int times;
        
        public Change (int times, int value) {
            this.value = value;
            this.times = times;
        }
        
        public String toString() {
            return "value:" + value + " times:" + times;
        }
        public int compareTo(Change another) {
            return another.value - value;
        }
    }

}
