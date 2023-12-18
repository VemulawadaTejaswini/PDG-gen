import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 2);
		int n = Integer.parseInt(first[0]);
		int m = Integer.parseInt(first[1]);
		Change.size = m;
		PriorityQueue<Change> onButton = new PriorityQueue<Change>(new Comparator<Change>() {
		    public int compare(Change c1, Change c2) {
		        return c1.right - c2.right;
		    }
		});
		PriorityQueue<Change> offButton = new PriorityQueue<Change>(new Comparator<Change>() {
		    public int compare(Change c1, Change c2) {
		        return c1.left - c2.left;
		    }
		});
		int onSum = 0;
		int offSum = 0;
		String[] line = br.readLine().split(" ", n);
		int prev = Integer.parseInt(line[0]) - 1;
		for (int i = 1; i < n; i++) {
		    int next = Integer.parseInt(line[i]) - 1;
		    Change c = new Change(prev, next);
		    if (c.involve(0)) {
		        onButton.add(c);
		        onSum += c.getScore(0);
		    } else {
		        offButton.add(c);
		        offSum += c.score;
		    }
		    prev = next;
		}
		int min = onSum + offSum;
		for (int i = 1; i < m; i++) {
		    while (onButton.size() > 0 && onButton.peek().right < i) {
		        Change c = onButton.poll();
		        onSum--;
		        offButton.add(c);
		        offSum += c.score;
		    }
		    onSum -= onButton.size();
		    while (offButton.size() > 0 && offButton.peek().left < i) {
		        Change c = offButton.poll();
		        offSum -= c.score;
		        onButton.add(c);
		        onSum += c.getScore(i);
		    }
		    min = Math.min(min, onSum + offSum);
		}
		System.out.println(min);
    }
    
    static class Change {
        static int size;
        int left;
        int right;
        int score;
        
        public Change(int left, int right) {
            this.left = left;
            this.right = right;
            score = (right - left + size) % size;
        }
        
        public boolean involve(int x) {
            if (left < right) {
                return left < x && right >= x;
            } else {
                return left < x || right >= x;
            }
        }
        
        public int getScore(int x) {
            return (right - x + size) % size + 1;
        }
        
        public String toString() {
            return left + ":" + right;
        }
    }
}

