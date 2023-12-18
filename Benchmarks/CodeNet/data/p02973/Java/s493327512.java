import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		TreeMap<Integer, Integer> b = new TreeMap<>();
		b.put(-1, 0);
		int ans = 0;
		for(int i = N-1; i >= 0; i--) {
			if(b.lastKey() <= A[i])
				ans++;
			else {
				int rk = b.higherKey(A[i]);
				if(b.get(rk) > 1)
					b.put(rk,b.get(rk)-1);
				else
					b.remove(rk);
			}
			if(b.containsKey(A[i])) {
				b.put(A[i],b.get(A[i])+1);
			}
			else
				b.put(A[i],1);
		}
		System.out.println(ans);

	}

}