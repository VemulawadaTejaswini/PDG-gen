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
				intarray.put(A[i], 1);
			} else {
				intarray.put(A[i], 0);
			}
		}
		
		int ans = 0;
		
		//System.out.print(intarray.get(18));
		
		for(int i = 0; i<N;i++){
				if(intarray.get(A[i]) == 1){
					ans++;
				}
		}
		
		System.out.println(ans);
	
		
	}
}