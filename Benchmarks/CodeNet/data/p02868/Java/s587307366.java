import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String[] first = br.readLine().split(" ", 2);
		int n = Integer.parseInt(first[0]);
		int m = Integer.parseInt(first[1]);
		long[] score = new long[n + 1];
		Arrays.fill(score, Long.MAX_VALUE / 10);
		PriorityQueue<Path> queue = new PriorityQueue<>();
		for (int i = 0; i < m; i++) {
		    String[] line = br.readLine().split(" ", 3);
		    int a = Integer.parseInt(line[0]);
		    int b = Integer.parseInt(line[1]);
		    int c = Integer.parseInt(line[2]);
		    queue.add(new Path(a, b, c));
		}
		score[1] = 0;
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    for (int i = p.from + 1; i <= p.to; i++) {
		        score[i] = Math.min(score[i], score[p.from] + p.value);
		    }
		}
		if (score[n] >= Long.MAX_VALUE / 10) {
		    System.out.println(-1);
		} else {
		    System.out.println(score[n]);
		}
	}
	
	static class Path implements Comparable<Path> {
	    int from;
	    int to;
	    int value;
	    
	    public Path(int from, int to, int value) {
	        this.from = from;
	        this.to = to;
	        this.value = value;
	    }
	    
	    public int compareTo(Path another) {
	        return from - another.from;
	    }
	}
}
