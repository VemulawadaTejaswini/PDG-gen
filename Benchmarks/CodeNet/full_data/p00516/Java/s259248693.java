
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] Ai = new int[N];
		int[] Bi = new int[M];
		int[] point = new int[N];
		int res = 0;
		for(int i = 0; i < N; i++){
			Ai[i] = sc.nextInt();
		}
		for(int j = 0; j < M; j++){
			Bi[j] = sc.nextInt();
		}
		for(int j = 0; j < M; j++){
			for(int i = N - 1; 0 <= i; i--){
				if(Bi[j] >= Ai[i]){
					res = i + 1;
				}
			}
			point[res]++;
		}
		int Maxp = 0;
		int pointer = 0;
		for(int i = N - 1; 0 <= i; i--){
			if(Maxp < point[i]){
				Maxp = point[i];
				pointer = i;
			}
		}
		System.out.println(pointer);
	}
}