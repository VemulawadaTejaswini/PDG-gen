import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] fact2 = new int[N];
		int[] fact5 = new int[N];
		int L = 45;
		int[][] map = new int[L*2][L*2];
		int exclude = 0;
		for(int i=0; i<N; i++) {
			String A = sc.next();
			int shosu = 0;
			int dot = A.indexOf(".");
			if(dot >= 0) {
				shosu = A.length()-dot-1;
				A = A.substring(0, dot) + A.substring(dot+1);
			}
			long v = Long.valueOf(A);
			fact2[i] = -shosu;
			fact5[i] = -shosu;
			while(v%2==0) {
				fact2[i]++;
				v/=2;
			}
			while(v%5==0) {
				fact5[i]++;
				v/=5;
			}
			map[L+fact2[i]][L+fact5[i]]++;
			if(fact2[i]>=0 && fact5[i]>=0)
				exclude++;
		}
		
		int[][] sum = new int[L*2][L*2];
		for(int i=L*2-1; i>=0; i--) {
			for(int j=L*2-1; j>=0; j--) {
				sum[i][j] = map[i][j] + (i<L*2-1 ? sum[i+1][j] : 0 ) + (j<L*2-1 ? sum[i][j+1] : 0) - (i<L*2-1 && j<L*2-1 ? sum[i+1][j+1] : 0);
			}
		}
		long ans = 0;
		
		for(int i=0; i<N; i++) {
			ans += sum[L-fact2[i]][L-fact5[i]];
		}
		
		System.out.println((ans-exclude)/2);
		
		sc.close();
	}
}
