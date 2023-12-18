import java.util.*;

public class Main {
	
	static int change = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		int[] L = new int[N];
		
		int ans = 0;
		
		int iv;
		int jv;
		int kv;
		
		for(int i = 0 ; i < N ; i++) {
			L[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < N-2 ; i++) {
			for(int j = i ; j < N-1 ; j++) {
				if (i == j) {
					continue;
				}
				for(int k = j ; k < N ; k++) {
					if (i == j || j == k || i == k) {
						continue;
					}
					
					iv = L[i];
					jv = L[j];
					kv = L[k];
					
					if ((iv < jv + kv) && (jv < kv + iv) && (kv < iv + jv)) {
						System.out.println(i+ " " + j+ " " + k);
						ans++;
					}
				}
			}
		}
		
		System.out.println(ans);
		
	}

}
