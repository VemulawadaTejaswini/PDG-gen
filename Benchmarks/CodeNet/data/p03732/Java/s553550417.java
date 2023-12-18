import java.util.*;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] weights = new int[n];
		int[] values = new int[n];
		for(int i=0; i<n; i++) {
			weights[i] = sc.nextInt();
			values[i] = sc.nextInt();
		}
		Main soln = new Main();
		long[][] cache = new long[n][w+1];
		for(int j=0; j<n; j++) {
			for(int z=0; z<w+1; z++) {
				cache[j][z] = -1;
			}
		}
		System.out.println(soln.jdg(cache, weights, values, w, 0));
	}

	private long jdg(long[][] cache, int[] weights, int[] values, int room, int step) {
		long res = 0;
		if(step==weights.length) return res;
		if(cache[step][room]>=0) return cache[step][room];
		if(weights[step]>room) res = jdg(cache, weights, values, room, step+1);
		else res = Math.max(jdg(cache, weights, values, room, step+1),
					   		jdg(cache, weights, values, room-weights[step], step+1)+values[step]);
		cache[step][room] = res;
		return res;
	}
}