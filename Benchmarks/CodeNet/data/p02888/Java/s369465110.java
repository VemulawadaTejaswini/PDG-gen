import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N];
		for(int i=0; i<N; i++)
			L[i] = sc.nextInt();

		Arrays.sort(L);
		int[] first = new int[1010];
		Arrays.fill(first, -1);
		for(int i=0; i<N; i++)
			if(first[L[i]]<0)
				first[L[i]] = i;
		
		long ans = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				int idx = Arrays.binarySearch(L, L[i]+L[j]);
				if(idx<0)
					idx = -idx-1;
				else
					idx = first[L[i]+L[j]];
				if(idx > j)
					ans += idx-j-1; 
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}