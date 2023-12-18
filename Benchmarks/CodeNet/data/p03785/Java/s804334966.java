import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int[] T = new int[N];
		for(int i=0; i<N; i++)
			T[i] = sc.nextInt();
		
		Arrays.sort(T);
		int ans = 0;
		int num = 0;
		int first = T[0];
		for(int i=0; i<=N; i++) {
			if(i==N || first+K<T[i] || C<=num) {
				ans++;
				if(i<N) {
					first = T[i];
					num = 1;
				}
			} else {
				num++;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}
