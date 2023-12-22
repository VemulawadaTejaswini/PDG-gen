import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		int M = keyboard.nextInt();
		
		int[] H = new int[N+1];
		for(int h=1; h<N+1; h++) {
			H[h] = keyboard.nextInt();
		}
		
		int[] Win = new int[N+1];
		//配列に初期値をセットする。初期値の1なら他の展望台よりも高い状態である
		Arrays.fill(Win, 1);
		
		for(int a=0; a<M; a++) {
			int aL = keyboard.nextInt();
			int bR = keyboard.nextInt();
			
			if(H[aL] > H[bR]) {
				if(Win[aL] == 1) {
					Win[aL] = 1;
				}
				Win[bR] = 0;
			}
			
			if(H[aL] < H[bR]) {
				if(Win[bR] == 1) {
					Win[bR] = 1;
				}
				Win[aL] = 0;
			}
			
			if(H[aL] == H[bR]) {
				Win[bR] = 0;
				Win[aL] = 0;
			}
		}
		
		int ans = 0;
		for(int w = 1; w<N+1; w++) {
			if(Win[w] == 1) {
				ans++;
			}
		}
		
		System.out.println(ans);
		keyboard.close();
	}
}
