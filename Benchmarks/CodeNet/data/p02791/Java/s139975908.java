import java.util.*;
/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		Integer Array[] = new Integer[N];
		int X = 0;
		for(int i=0; i<N-1; i++){
			Array[i] = sc.nextInt();
		}
		for(int i=1; i<=N; i++){
			for(int j=1; j<=i; j++){
				if(Array[i-1]<=Array[j-1]){
					X += 1;
				}
			}
		}
		System.out.println(X);
		sc.close();
	}
};
