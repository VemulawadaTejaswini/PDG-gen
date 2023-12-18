import java.util.*;

public class Main{
//public class abc166_c{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		long[] H = new long[N];

		for(int i=0; i<N;i++){
			H[i] = scan.nextLong();

		}
		int[][] tunagari = new int[N+1][N+1];
		for(int i=0; i<M; i++){
			int a =scan.nextInt();
			int b =scan.nextInt();

			tunagari[a][b]++;
			tunagari[b][a]++;

			for(int j=1; j<=N; j++){
				if(tunagari[j][a] > 0) {
					tunagari[j][b]++;
					tunagari[b][j]++;
				}
			}
			for(int j=1; j<=N; j++){
				if(tunagari[j][b] > 0) {
					tunagari[j][a]++;
					tunagari[a][j]++;
				}
			}
		}


		int con = 0;

		for(int i=1; i<=N; i++){
			boolean o_flag = true;
			boolean flag = true;
			for(int j=1; j<=N ; j++){
				if(tunagari[i][j] > 0){
					o_flag = false;
					if(H[i-1] < H[j-1]) flag= false;
				}
			}
			if(o_flag || flag) con++;
		}
		con++;
		System.out.println(con);
	}

}