import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = s.nextLong();
		}
		
		int result = 0;
		for(int n = N - 1; n >= 0; n--) {
			for(int i = 0; i < n; i++) {
				if(n - i == A[n] + A[i]) {
					result++;
				}
			}
		}
		
		System.out.println(result);
    }
}
