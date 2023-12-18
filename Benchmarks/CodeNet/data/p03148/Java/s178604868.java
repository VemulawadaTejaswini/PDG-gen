import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Sushi[] sushies = new Sushi[n];
		for (int i = 0; i < n; i++) {
		    sushies[i] = new Sushi(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(sushies);
		boolean[] used = new boolean[n + 1];
		PriorityQueue<Sushi> stock = new PriorityQueue<>();
		long max = 0;
		long total = 0;
		long count = 0;
		for (int i = 0; i < n; i++) {
		    Sushi s = sushies[n - i - 1];
		    if (i < k) {
		        total += s.value;
		        if (used[s.type]) {
		            stock.add(s);
		        } else {
		            used[s.type] = true;
		            count++;
		        }
		        max = total + count * count;
		    } else {
		        if (used[s.type]) {
		            continue;
		        }
		        used[s.type] = true;
		        count++;
		        if (stock.size() > 0) {
		            total -= stock.poll().value;
		        }
		        total += s.value;
		        max = Math.max(max, total + count * count);
		    }
		}
		System.out.println(max);
    }
    
    static class Sushi implements Comparable<Sushi> {
        int type;
        int value;
        
        public Sushi(int type, int value) {
            this.type = type;
            this.value = value;
        }
        
        public int compareTo(Sushi another) {
            return value - another.value;
        }
    }
}

