import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solveZerSumRanges();
	}

	public static void solveZerSumRanges(){

		int N = sc.nextInt();
		long[] A = new long[N];

		for(int i=0;i<N;i++){
			A[i] = sc.nextLong();
		}

		long[] cs = new long[N+1];

		cs[0] = 0;

		for(int i=0;i<N;i++){
			cs[i+1] = cs[i] + A[i];
		}

		Map<Long, Integer> m = new HashMap<Long, Integer>();
		
		for(long l: cs){
			
			int mi = m.containsKey(l) ? m.get(l) : 0;
			m.put(l, mi + 1);
		}
		
		long ans = 0L;
		for(Map.Entry<Long, Integer> e : m.entrySet()){
			int n = e.getValue();
			ans += n * (n-1) / 2L; 
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}