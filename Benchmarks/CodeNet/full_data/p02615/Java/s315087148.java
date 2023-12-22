import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		long[] A = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = Long.valueOf(s.next());
		}
		Arrays.sort(A);

		long ret = A[N-1];
		int index = 2;
		int cnt = 0;
		for(int i = 2; i < N; i++) {
			ret += A[N-index];
			if(i%2 == 0) {
				index++;
			}
		}
		System.out.println(ret);
	}
}