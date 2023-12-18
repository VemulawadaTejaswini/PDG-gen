import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		
		int A[] = new int [N];
		
		for(int i = 0;i<N;i++){
			A[i] = scan.nextInt();
		}
		
		TreeMap<Integer, Integer> intarray = new TreeMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			if (!(intarray.containsKey(A[i]))) {
				intarray.put(A[i], 0);
			} else {
				Integer previousValue = intarray.get(A[i]);
				previousValue++;
				intarray.put(A[i], previousValue);
			}
		}
		
		int ans = 0;
		
		//System.out.print(intarray.get(18));
		
		for(int i = 0; i<N;i++){
			if (intarray.containsKey(A[i])) {
				if((intarray.get(A[i]))%2 == 0){
					ans++;
				} 
			}
		}
		
		System.out.println(ans);
	
		
	}
	
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
	}
}