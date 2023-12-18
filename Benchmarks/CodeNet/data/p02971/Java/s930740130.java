import java.util.*;
public class Main {
	
	static int mod = (int)1e9+7;
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer A[] = new Integer[N];
		for(int i=0;i<N;i++)A[i]=sc.nextInt();
		sc.close();
		
		Integer B[] = A.clone();
		Arrays.sort(A,(a1,a2)->a2-a1);
		int max = A[0];
		int max2 = A[1];
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			int tmax = max;
			if(B[i]==max) tmax = max2;
			sb.append(tmax + "\n");
		}
		System.out.println(sb.toString());
	}
}