
import java.util.*;

public class Main {
	static void print_r(int[] ary){
		int j;
		System.out.print(ary[0]);
		for ( j = 1; j < ary.length; j++ ) {
			if ( ary[j] == 0 ) {
				System.out.println();
				return;
			}
			System.out.print(" "+ary[j]);
		}
	}
	static void eachBlocks(int[] ary ){
		if ( ary[0] == 1 ) return;
		for ( int j = 1; j < ary.length; j++) {
			for ( int i = ary.length-1; i >= j; i-- ){
				if ( ary[i-j] - ary[i] >= 2 && ary[i-j] != 1 ) {
					ary[i]++; ary[i-j]--;
					print_r(ary);
					eachBlocks(ary);
					return;
				}
			}
		}
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while( !sc.hasNext("0") ) {
			int n = sc.nextInt();
			int[] blocks = new int[n];
			blocks[0] = n;
			print_r(blocks);
			eachBlocks(blocks);
		}
	}
}