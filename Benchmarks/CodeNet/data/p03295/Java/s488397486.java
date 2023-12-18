import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Bridge> queue = new PriorityQueue<>();
		for (int i = 0; i < m; i++) {
		    queue.add(new Bridge(sc.nextInt(), sc.nextInt()));
		}
		int count = 0;
		while (queue.size() > 0) {
		    count++;
		    Bridge b = queue.poll();
		    while (queue.size() > 0 && b.right > queue.peek().left) {
		        queue.poll();
		    }
		}
		System.out.println(count);
    }
    
    static class Bridge implements Comparable<Bridge> {
        int left;
        int right;
        
        public Bridge (int left, int right) {
            this.left = left;
            this.right = right;
        }
        
        public int compareTo(Bridge another) {
            if (right == another.right) {
                return left - another.left;
            } else {
                return right - another.right;
            }
        }
    }
}

