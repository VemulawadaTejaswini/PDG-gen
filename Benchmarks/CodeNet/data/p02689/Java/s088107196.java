import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] H = new long[N];
		long ans = N;
		boolean[] flg = new boolean[N];
		for(int i = 0;i < N;i++){
			H[i] = sc.nextLong();
		}
		boolean[][] AB = new boolean[N][N];
		for(int i = 0;i < M;i++){
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			AB[A][B] = true;
			AB[B][A] = true;
		}
		for(int i = 0;i < N - 1;i++){
			for(int j = i + 1;j < N;j++){
				if(AB[i][j]){
					if(H[i] > H[j]){
						flg[j] = true;
					}else if(H[i] < H[j]){
						flg[i] = true;
					}else{
						flg[i] = true;
						flg[j] = true;
					}
				}
			}
		}
		for(int i = 0;i < N;i++){
			if(flg[i]){
				ans--;
			}
		}
		System.out.println(ans);
	}
}