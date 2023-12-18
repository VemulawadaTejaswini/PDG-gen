import java.util.*;
class Card {
    int b;
    int c;
    public Card(int b, int c) {
	this.b = b;
	this.c = c;
    }
    int getC() {
	return c;
    }
}
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int m = Integer.parseInt(sc.next());
	long[] a = new long[n];
	long[] sum = new long[n+1];
	PriorityQueue<Long> queue = new PriorityQueue<Long>(n);

	for(int i = 0; i<n; i++) {
	    a[i] = Long.parseLong(sc.next());
	}
	Arrays.sort(a);

	for(int i = 0; i<n; i++) {
            sum[i+1] = a[i] + sum[i];
	}

	Card[] ca = new Card[m];
	long max = sum[n];
	for(int i = 0; i<m; i++) {
	    int b = Integer.parseInt(sc.next());
	    int c = Integer.parseInt(sc.next());
	    ca[i] = new Card(b,c);
	}

	Arrays.sort(ca, (ax,bx)-> bx.c - ax.c);

	for(int i = 0; i<m; i++) {
	    Card card = ca[i];
	    if(queue.size() >= n) break;
 	    for(int j = 0; j<ca[i].b; j++) {
		if (queue.size() < n) {
		    queue.add((long)ca[i].c);
		} else {
		    if(queue.peek()<(long)ca[i].c) {
			queue.poll();
			queue.add((long)ca[i].c);
		    }else {
			break;
		    }
		}
	    }
	}

	Long[] tmp = queue.toArray(new Long[0]);

	Arrays.sort(tmp, Collections.reverseOrder());

	for(int i = 0; i<n; i++) {
	    for(int j = 0; j<tmp.length; j++) {
		if(tmp[j] == null) continue;
		if(a[i] <tmp[j]) {
		    a[i] = tmp[j];
		    tmp[j] = -1L;
		    i++;
		    if(i>=n) break;
		}
	    }
	}

	long total = 0;
	for(int i = 0; i<n; i++) {
	    total += a[i];
	}

	System.out.println(total);

    }
}