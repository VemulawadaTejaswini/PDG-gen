import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long m = in.nextLong();
		long[] ary = new long[999];
	
		int toAdd = 1;
		for ( int i = 0; i < 999; i++ ) {
			if ( i == 0 )
				ary[i] = toAdd;
			else
				ary[i] = ary[i-1] + toAdd;
			toAdd++;
		}

		long lim = 0;
		for ( int i = 0; i < 999; i++ ) {
			if ( ary[i] > n ) {
				lim = ary[i];
				break;
			}
		}
		
		System.out.println(lim-n);
		System.out.println(Arrays.toString(ary));
	}
}