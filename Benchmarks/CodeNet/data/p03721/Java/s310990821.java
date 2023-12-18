import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long total = 0;
		Pair[] pairs = new Pair[n];
		for (int i = 0; i < n; i++) {
		    pairs[i] = new Pair(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(pairs);
		for (int i = 0; i < n; i++) {
		    total += pairs[i].b;
		    if (total >= k) {
		        System.out.println(pairs[i].a);
		        return;
		    }
		}
	}
	
	static class Pair implements Comparable<Pair> {
	    int a;
	    int b;
	    public Pair(int a, int b) {
	        this.a = a;
	        this.b = b;
	    }
	    
	    public int compareTo(Pair another) {
	        return a - another.a;
	    }
	}
}
