import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			long K = scan.nextLong();
			long[]A = new long[N];
			long[]a = new long[N];
			long[]z = new long[N+1];

			long mod = (long)1e9+7;
			Map<Long,Long>map = new TreeMap<Long,Long>();

			for(int i = 0;i<N;i++) {
				A[i] = scan.nextLong();
				if(map.containsKey(A[i]))map.put(A[i], map.get(A[i])+1l);
				else map.put(A[i], 1l);

			}


			ArrayList<Long>are = new ArrayList<Long>();
			long go = 0;
			for(Long key:map.keySet()) {
				long x = map.get(key);
				//System.out.println(x);
				map.put(key, go);
				go = (go+x)%mod;
			}



			for(int i = 0;i<N-1;i++) {
				for(int j = i+1;j<N;j++) {
					if(A[i]>A[j]) {
						a[i]++;
					}
				}
			}


			long goukei =0;

			for(int i = 0;i<N;i++) {

				goukei=(goukei+(K*a[i])%mod)%mod;

				long si = (((K*(K-1))%mod)/2)%mod;

				goukei = (goukei+(si*map.get(A[i]))%mod)%mod;

			}

			System.out.println(goukei);




		}


	}


}
