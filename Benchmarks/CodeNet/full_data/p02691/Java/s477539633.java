import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		long[] A = new long[N];
		boolean[] strict = new boolean[N];
		for(int i = 0; i < N; i++) {
			A[i] = s.nextLong();
			strict[i] = A[i] > 2 * 1000000;
			
		}
		
		int result = 0;
		for(int n = N - 1; n >= 0; n--) {
			if(strict[n])
				continue;
			for(int i = 0; i < n; i++) {
				if(strict[i])
					continue;
				if(n - i == A[n] + A[i]) {
					result++;
				}
			}
		}
		
		System.out.println(result);
    }
}
