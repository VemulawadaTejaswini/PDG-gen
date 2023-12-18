import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] ary = new int[999];
	
		int toAdd = 1;
		for ( int i = 0; i < 999; i++ ) {
			if ( i == 0 )
				ary[i] = toAdd;
			else
				ary[i] = ary[i-1] + toAdd;
			toAdd++;
		}

		// System.out.println(Arrays.toString(ary));
		int lim = 0;
		for ( int i = 0; i < 999; i++ ) {
			if ( ary[i] > m ) {
				lim = ary[i-1];
				break;
			}
		}
		
		System.out.println(lim-n);
	}
}
