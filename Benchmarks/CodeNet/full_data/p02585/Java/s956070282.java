import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int K = s.nextInt();
	int[] P = new int[N];
	long[] C = new long[N];

	for(int i = 0; i < N; i++){
		P[i] = s.nextInt()-1;
	}
	for(int i = 0; i < N; i++){
		C[i] = s.nextLong();
	}

	long max = Long.MIN_VALUE;
	for(int i = 0; i < N; i++){
		long count = 0;
		int next = i;
		for(int j = 0; j < Math.min(K, N); j++){
			count += C[P[next]];
			max = Math.max(max, count);
			next = P[next];
		}
		if(K > N && count > 0){
			count = count*(K/N);
			for(int j = 0; j < K%N; j++){
				count += C[P[next]];
				max = Math.max(max, count);
				next = P[next];
			}
		}
	}

	System.out.println(max);

    
  }
}