import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();

		LinkedList<Long> ll = new LinkedList<Long>();
		for ( int i=0; i<=100; i++ ) {
			ll.add((long)Math.pow(i,5));
		}

		for ( int i=-100; i<=100; i++ ) {
			long a5 = 0;
			if ( i>=0 ) {
				a5 = ll.get(i);
			} else {
				a5 = 0l - ll.get(0-i);
			}
			for ( int j=-100; j<=100; j++ ) {
				long b5 = 0;
				if ( j>=0 ) {
					b5 = ll.get(j);
				} else {
					b5 = 0l - ll.get(0-j);
				}
				if ( a5>b5 && x==a5-b5 ) {
					System.out.println(i + " " + j);
					System.exit(0);
				}
			}
		}
	}
}
