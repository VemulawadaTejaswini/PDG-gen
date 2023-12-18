import java.util.HashMap;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();


		long [] A = new long[N+1];
		long[] data = new long[100000];

		for(int i= 1;i < N;i++){
			A[i] = scan.nextInt()+A[i-1];
		}
		
		
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		for(int i= 0;i<A.length;i++){
			map.put(A[i]%M, map.getOrDefault(A[i]%M, 0l)+1);
		}
		
		long  result = 0;
		for(long key:map.keySet()){					//mapのkeyを全て呼び出す
			long num = map.get(key);
			result+=(num*(num-1))/2;
		}	
		//		for(int i = 0;i< count;i++){
		//			System.out.println(data[i]);
		//		}
		//		System.out.println();
		System.out.println(result);
	}
}