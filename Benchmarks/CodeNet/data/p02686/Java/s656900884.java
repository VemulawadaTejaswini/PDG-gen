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
		    if (current + p.min < 0) {
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
	    int min;
	    
	    public Paren(char[] arr) {
	        min = Integer.MAX_VALUE;
	        result = 0;
	        for (char c : arr) {
	            if (c == '(') {
	                result++;
	            } else {
	                result--;
	            }
	            min = Math.min(min, result);
	        }
	    }
	    
	    public int compareTo(Paren another) {
	        if (min == another.min) {
	            return another.result - result;
	        } else {
	            return another.min - min;
	        }
	    }
	}
}
