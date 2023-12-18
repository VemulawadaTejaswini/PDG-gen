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

	Long[] tmp = new Long[n];
	int count = 0;
	for(int i = 0; i<m; i++) {
	    Card card = ca[i];
	    for(int j = 0; j<card.b; j++) {
		if(count==n)break;
		tmp[count] = (long)card.c;
		count++;
	    }
	    if(count==n)break;
	}
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