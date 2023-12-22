import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long n = scan.nextLong();

		TreeSet<Long> ts = new TreeSet<>();
		for (long x=1; x<n+1; x++) {
			ts.add(((long)((a*x)/b) - a*(long)(x/b)));
	    }

		System.out.println(ts.pollLast());
	    scan.close();	
    }
}