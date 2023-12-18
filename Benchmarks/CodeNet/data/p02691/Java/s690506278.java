import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static long solveNaive(int A[]){
		int N = A.length;
		long cnt = 0;
		for(int i = 0 ; i < N ; ++i){
			int Aii = A[i] + i;				
			for(int j = i + 1 ; j < N ; ++j){
				if(Aii == j - A[j]){
					++cnt;
				}
			}
		}
		return cnt;
	}
	static long solve(int A[]){
		// A[i] + A[j] == (j - i)
		// A[i] + i == j - A[j]
		int N = A.length;
		Map<Long , Integer> count = new HashMap();
		for(int j = 0 ; j < N ; ++j){
			long v = j - A[j];
			if(!count.containsKey(v)){
				count.put(v, 1);
			}else{
				int c  =count.get(v);
				count.put(v, c + 1);
			}
		}
		long ret = 0;
		for(int i = 0 ; i < N ; ++i){
			long Aji = i - A[i];
			int c = count.get(Aji);
			count.put(Aji, c - 1);
			long Aii = A[i] + i;
			if(count.containsKey(Aii)){
				ret += count.get(Aii); 
			}			
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0 ; i < A.length ; ++i){
			A[i] = sc.nextInt();
		}
		System.out.println(solve(A));
	}
}
