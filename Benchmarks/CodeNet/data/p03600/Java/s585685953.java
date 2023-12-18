import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[][] = new long[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				A[i][j]=sc.nextLong();
			}
		}
		sc.close();
		
		List<int[]> rm = new ArrayList<int[]>();
		
		for(int k=0;k<N;k++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(A[i][j]==A[i][k]+A[k][j]) {
						if(i==j||j==k||k==i)continue;
						if(i<j)continue;
						int rmArr[] = {i,j}; 
						rm.add(rmArr);
					}
					if(A[i][j]>A[i][k]+A[k][j]) {
						System.out.println(-1);
						return;
					}
				}
			}
		}
		
		long sum = 0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				sum += A[i][j];
			}
		}
		long dec = 0;
		for(int t[]:rm) {
			int from = t[0], to = t[1];
			dec += A[from][to];
		}
		long ans = sum - dec;
		
		System.out.println(ans);
		
		
	}
}