import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		PriorityQueue<Program> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
		    queue.add(new Program(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		int[] imos = new int[100001];
		while (queue.size() > 0) {
		    Program p = queue.poll();
		    while (queue.size() > 0 && queue.peek().channel == p.channel && queue.peek().start == p.end) {
		        p.end = queue.poll().end;
		    }
		    imos[p.start - 1]++;
		    imos[p.end]--;
		}
		int max = 0;
		for (int i = 1; i < imos.length; i++) {
		    imos[i] += imos[i - 1];
		    max = Math.max(max, imos[i]);
		}
		System.out.println(max);
    }
    
    static class Program implements Comparable<Program> {
        int start;
        int end;
        int channel;
        
        public Program(int start, int end, int channel) {
            this.start = start;
            this.end = end;
            this.channel = channel;
        }
        
        public int compareTo(Program another) {
            if (channel == another.channel) {
                return start - another.start;
            } else {
                return channel - another.channel;
            }
        }
    }
}

