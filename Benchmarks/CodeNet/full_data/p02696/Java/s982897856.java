import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long n = scan.nextLong();
		PriorityQueue<Long> pq 
			= new PriorityQueue<>(Collections.reverseOrder());

		for (long x=1; x<n+1; x++) {
			pq.offer(((long)((a*x)/b) - a*(long)(x/b)));
	    }

		System.out.println(pq.poll());
	    scan.close();	
    }
}