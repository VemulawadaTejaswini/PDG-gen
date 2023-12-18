import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		int X[];
		int N, M;
		
		int Dis[];
		int Skips=0;
		
		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		M = scanner.nextInt();
		
		X = new int[M];
		for(int i=0; i<M; i++) {
			X[i] = scanner.nextInt();
		}
		Arrays.sort(X);
		
			//座標の距離を求めソート
		Dis = new int[M-1];
		for(int i=0; i<M-1; i++) {
			Dis[i] = X[i+1] - X[i];
		}
		Arrays.sort(Dis);
		
		
			/*System.out.println("N:"+N + " M:"+M);
			for(int i=0; i<M; i++) {
			System.out.print(X[i]+" ");
			}System.out.print("\n");*/
		
		
			//駒が多ければ移動無し//
		if(N >= M) {
			System.out.print("0");
			return;
		}
		
			//通らない場所を Dis[] の後ろから(N-1)こ取る//
		for(int i=0; i<N-1; i++) {
			Skips += Dis[M-2-i];
		}
		
			// (X[M] - X[1]) - Skips ... Answer
		System.out.print(X[M] - X[1] - Skips);
		
	return;
	}
	
	

}
