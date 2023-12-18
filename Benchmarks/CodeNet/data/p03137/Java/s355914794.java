import java.util.*;

public class C {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] ary = new int[k];
		for( int i = 0; i < k; i++ ) ary[i] = in.nextInt();
		Arrays.sort(ary);
		int ans = 0;
		if( k != 1 ) {
			int[] diffs = new int[k-1];
			for( int i = 0; i < k-1; i++ ) diffs[i] = ary[i+1] - ary[i];
			Arrays.sort(diffs);
			//System.out.println(Arrays.toString(diffs));
			for( int i = 0; i < k-n; i++ ) ans += diffs[i];
		}
		System.out.println(ans);
	}
}