import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N];
		for(int i=0; i<N; i++)
			L[i] = sc.nextInt();

		Arrays.sort(L);
		long ans = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				int idx = Arrays.binarySearch(L, L[i]+L[j]);
				if(idx<0)
					idx = -idx-1;
				if(idx > j)
					ans += idx-j-1; 
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}
