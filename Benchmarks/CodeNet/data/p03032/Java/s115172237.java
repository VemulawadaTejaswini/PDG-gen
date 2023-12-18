import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int N = in.nextInt(), K = in.nextInt();
	int[] V = new int[N];
	for (int i = 0; i < N; i++) {
	    V[i] = in.nextInt();
	}
	int tryMax = Math.min(N, K);
	int ans = 0;
	for (int a = 0; a <= tryMax; a++) {
	    for (int b = 0; b <= (tryMax - a); b++) {
		int[] arr = concat(
		    Arrays.copyOfRange(V, 0, a),
		    Arrays.copyOfRange(V, N - b, N));
		Arrays.sort(arr);
		int max = Math.min(arr.length, tryMax - a - b);
		for(int k = 0; k < max; k++) {
		    if(arr[k] > 0) { break; }
		    arr[k] = 0;
		}
		ans = Math.max(ans, IntStream.of(arr).sum());
	    }
	}
	System.out.println(ans);
    }
    
    public static int[] concat(int[] arr1, int[] arr2) {
	int[] res = new int[arr1.length + arr2.length];
	for (int i = 0; i < arr1.length; i++) {
	    res[i] = arr1[i];
	}
	for (int i = 0; i < arr2.length; i++) {
	    res[arr1.length + i] = arr2[i];
	}
	return res;
    }
}
