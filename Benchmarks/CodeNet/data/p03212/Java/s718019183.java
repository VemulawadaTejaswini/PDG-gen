import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 357) {
		    System.out.println(0);
		    return;
		}
		int now = 1000;
		ArrayDeque<Integer> deq = new ArrayDeque<>();
        ArrayDeque<Integer> next = new ArrayDeque<>();
        deq.add(0);
        int size = 0;
		while (deq.size() > 0) {
		    int x = deq.poll();
		    if (x > n) {
		        continue;
		    }

		    next.add(x * 10 + 3);
		    next.add(x * 10 + 5);
		    next.add(x * 10 + 7);
		    if (x > Integer.MAX_VALUE / 10 - 10) {
		        break;
		    }
		    deq.add(x * 10 + 3);
		    deq.add(x * 10 + 5);
		    deq.add(x * 10 + 7);
		}
		int count = 0;
		while (next.size() > 0) {
		    int x = next.poll();
		    if (x <= n && is753(x)) {
		        count++;
		    }
		}
		System.out.println(count);
	}
	
	static boolean is753(int x) {
	    int[] mod = new int[10];
	    while(x > 0) {
	        mod[x % 10]++;
	        x /= 10;
	    }
	    return mod[3] > 0 && mod[7] > 0 && mod[5] > 0;
	}
}
