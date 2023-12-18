import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		/*
    		Work a = new Work(1,1);
    		Work b = new Work(1,2);
    		Work c = new Work(2,1);
    		Work d = new Work(2,2);
    		WorkComparator comp = new WorkComparator();
    		System.out.println(comp.compare(a, b));
    		System.out.println(comp.compare(c, d));
    		System.out.println(comp.compare(a, c));
    		System.out.println(comp.compare(b, d));
    		*/

    		int n = sc.nextInt();
    		int m = sc.nextInt();

    		PriorityQueue<Work> pq = new PriorityQueue<>(n, new WorkComparator());
    		for (int i=0; i<n; i++) {
    			int a = sc.nextInt();
    			int b = sc.nextInt();
    			Work w = new Work(a, b);
    			pq.add(w);
    		}

    		Work[] wariate = new Work[m+1];
    		int count = 0;
    		while (!pq.isEmpty() && count < m) {
    			Work w = pq.poll();
    			INNER: for (int i=w.a; i<=m; i++) {
        			if (wariate[i] == null) {
        				wariate[i] = w;
        				count++;
        				break INNER;
        			}
    			}
    		}

    		int sum = 0;
    		for (int i=0; i<wariate.length; i++) {
    			if (wariate[i] != null) {
    				sum += wariate[i].b;
    			}
    		}

    		System.out.println(sum);

    	} finally {
    		sc.close();
    	}
    }


}

class Work {
	public int a;
	public int b;
	public Work(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class WorkComparator implements Comparator<Work> {

	@Override
	public int compare(Work o1, Work o2) {
		if (o1.b > o2.b) {
			return -1;
		} else if (o1.b < o2.b) {
			return 1;
		} else {
			if (o1.a > o2.a) {
				return -1;
			} else if (o1.a < o2.a) {
				return 1;
			}
		}
		return 0;
	}
}

