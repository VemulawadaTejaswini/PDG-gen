import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Paren> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
		    queue.add(new Paren(sc.next().toCharArray()));
		}
		long current = 0;
		while (queue.size() > 0) {
		    Paren p = queue.poll();
		    if (current + p.min1 < 0) {
		        System.out.println("No");
		        return;
		    }
		    current += p.result;
		}
		if (current == 0) {
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
	}
	
	static class Paren implements Comparable<Paren> {
	    int result;
	    int min1;
	    int min2;
	    
	    public Paren(char[] arr) {
	        min1 = 0;
	        result = 0;
	        for (char c : arr) {
	            if (c == '(') {
	                result++;
	            } else {
	                result--;
	            }
	            min1 = Math.min(min1, result);
	        }
	        min2 = min1 - result;
	    }
	    
	    public int compareTo(Paren another) {
	        if (result > 0 && another.result > 0) {
	            return another.min1 - min1;
	        } else if (result > 0 && another.result <= 0) {
	            return -1;
	        } else if (result <= 0 && another.result > 0) {
	            return 1;
	        } else {
	            return min2 - another.min2;
	        }
	    }
	}
}
