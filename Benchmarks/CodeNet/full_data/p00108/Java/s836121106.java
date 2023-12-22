import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main0108 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;
		while((N = scan.nextInt()) != 0) {
			int[] S = new int[N];
			for(int i = 0; i < N; i++) {
				S[i] = scan.nextInt();
			}
			int n = 0;
			int[] prev = S;
			int[] now = new int[N];
			for( ; !Arrays.equals(prev, now);) {
				n++;
				if(n >= 2){
					prev = now;
				}
				now = new int[N];
				Map<Integer,Integer> mset = new HashMap<Integer,Integer>();
				for(int i = 0; i < N; i++) {
					if(mset.containsKey(prev[i])) {
						mset.put(prev[i],mset.get(prev[i]).intValue()+1);
					} else {
						mset.put(prev[i], 1);
					}
				}
				for(int i = 0; i < N; i++) {
					now[i] = mset.get(prev[i]).intValue();
				}
			}
			System.out.println(n-1);
			for(int i = 0; i < N; i++) {
				if(i > 0){
					System.out.print(" ");
				}
				System.out.print(now[i]);
			}
			System.out.println();
		}
		scan.close();
	}

}