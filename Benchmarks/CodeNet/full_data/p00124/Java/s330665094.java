import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Team> queue = new PriorityQueue<>();
		boolean isFirst = true;
		while (true) {
		    int n = sc.nextInt();
		    if (n == 0) {
		        break;
		    }
		    if (!isFirst) {
    		    sb.append("\n");
		    }
		    isFirst = false;
		    for (int i = 0; i < n; i++) {
		        queue.add(new Team(i, sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		    }
		    while (queue.size() > 0) {
		        sb.append(queue.poll()).append("\n");
		    }
		}
		System.out.print(sb);
	}
	
	static class Team implements Comparable<Team> {
	    int idx;
	    String name;
	    int point;
	    
	    public Team(int idx, String name, int win, int lose, int draw) {
	        this.idx = idx;
	        this.name = name;
	        this.point = win * 3 + draw;
	    }
	    
	    public int compareTo(Team another) {
	        if (point == another.point) {
	            return idx - another.idx;
	        } else {
	            return another.point - point;
	        }
	    }
	    
	    public String toString() {
	        return name + "," + point;
	    }
	}
}

