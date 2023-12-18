import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] H = new long[N];
		
		HashMap<Long, Integer> hm = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			long l = sc.nextLong() - i;
			H[i] = l;
			if(!hm.containsKey(l))hm.put(l, 1);
			else hm.put(l, hm.get(l) + 1);
		}
		
		long count = 0;
		
		for(int i = 0; i < N - 1; i++) {
			hm.put(H[i], hm.get(H[i]) - 1);
			H[i] += i * 2;
			if(hm.containsKey(-H[i]))count += hm.get(-H[i]);
		}
		System.out.println(count);
		sc.close();
	}
}