import java.util.*;
public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), Q = sc.nextInt();
		int section[][] = new int[M][2];
		for(int i=0;i<M;i++) {
			section[i][0]= sc.nextInt() - 1; //L
			section[i][1]= sc.nextInt() - 1; //R
		}
		int queries[][] = new int[Q][2];
		for(int i=0;i<Q;i++) {
			queries[i][0] = sc.nextInt() - 1;
			queries[i][1] = sc.nextInt() - 1 ;
		}
		sc.close();
		
		
		int sectionTable[][] = new int[N][N];
		for(int i=0;i<M;i++) {
			int l = section[i][0];
			int r = section[i][1];
			sectionTable[l][r] += 1;
		}
		
		//二次元累積和
		int sum [][] = new int[N][N];
		sum[0][0]=sectionTable[0][0];
		for(int i=0;i<N-1;i++) {
			sum[i+1][0] = sum[i][0]+sectionTable[i+1][0];
			sum[0][i+1] = sum[0][i]+sectionTable[0][i+1];
		}
		
		for(int l = 0;l<N-1;l++) {
			for(int r = 0;r<N-1;r++) {
				sum[l+1][r+1] = sum[l][r+1] + sum[l+1][r] - sum[l][r] + sectionTable[l+1][r+1];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<Q;i++) {
			int ql = queries[i][0];
			int qr = queries[i][1];
			int ans = 0;
			if(ql==0) ans = sum[qr][qr];
			else ans = sum[qr][qr]-sum[qr][ql-1]-sum[ql-1][qr] + sum[ql-1][ql-1];
			sb.append(ans + "\n");
		}
		
		System.out.println(sb.toString());
		
	}
}