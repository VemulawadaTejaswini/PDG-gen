import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		int x = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[100012];
		int minn = (int)Math.min(n, 100010L);

		HashMap<Integer, Integer> res = new HashMap<Integer, Integer>();

		boolean loop_exist = false;
		int loop_start = 0;
		int loop_length = 0;

		int x1 = x;
		for ( int i=0; i<minn; i++ ) {
			a[i+1] = a[i]+x1;
			if ( res.containsKey(x1) ) {
				loop_exist = true;
				loop_start = res.get(x1)+1;
				loop_length = i+1 - loop_start;
				break;
			} else {
				res.put(x1, i);
				x1 = (int)(((long)x1*(long)x1)%(long)m);
			}
		}

		long loop_mae = 0;
		long loop_chu = 0;
		long loop_ato = 0;

		if ( loop_exist ) {
			int loop_times = (int)((n+1L-(long)loop_start)/(long)loop_length);
			int loop_mod = (int)((n+1L-(long)loop_start)%(long)loop_length) -1;

			loop_mae = (long)a[loop_start];
			loop_chu = ((long)a[loop_start+loop_length]-(long)a[loop_start])*(long)loop_times;
			loop_ato = (long)a[loop_start+loop_mod]-(long)a[loop_start];
		} else {
			loop_mae = (long)a[(int)n];
		}

		long loop_sum = loop_mae + loop_chu + loop_ato;
		System.out.println(loop_sum);
	}
}