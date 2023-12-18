import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Long> shrines = new TreeSet<Long>(), temples = new TreeSet<Long>();
		int a = sc.nextInt(), b = sc.nextInt(), q = sc.nextInt();
		for (int i = 0; i < a; i++){
			shrines.add(sc.nextLong());
		}for (int i = 0; i < b; i++){
			temples.add(sc.nextLong());
		}for (int i = 0; i < q; i++){
			long x = sc.nextLong();
			Long lshrine = shrines.floor(x);
			lshrine = (lshrine == null?(1L<<60):x - lshrine);//if it is null, set to infinity
			Long rshrine = shrines.ceiling(x);
			rshrine = (rshrine == null?(1L<<60):rshrine - x);
			Long ltemple = temples.floor(x);
			ltemple = (ltemple == null?(1L<<60):x - ltemple);
			Long rtemple = temples.ceiling(x);
			rtemple = (rtemple == null?(1L<<60):rtemple - x);
			System.out.println(Math.min(Math.min(Math.max(lshrine, ltemple), Math.max(rshrine, rtemple)),
					Math.min(Math.min(lshrine*2+rtemple, ltemple*2+rshrine),
							Math.min(lshrine+2*rtemple, ltemple+2*rshrine))));
		}

	}
}