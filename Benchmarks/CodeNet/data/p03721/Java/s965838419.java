import java.util.*;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();

		Map<Integer, Long> mp = new HashMap<Integer, Long> ();
		int[] ar = new int[n];
		for(int p=0; p<ar.length; p++) {
			ar[p] = Integer.MAX_VALUE;
		}
		int i = 0;
		while(sc.hasNextLine()) {
			int a = sc.nextInt();
			long t = sc.nextLong();
			if(mp.containsKey(a)) {
				mp.put(a, mp.get(a)+t);
			}
			else {
				mp.put(a, t);
				ar[i++] = a;
			}
		}
		
		Arrays.sort(ar);
		i = 0;
		long ttl = mp.get(ar[i]);
		while(ttl<k) {
			i++;
			ttl += mp.get(ar[i]);
		}
		System.out.println(ar[i]);
	}
}