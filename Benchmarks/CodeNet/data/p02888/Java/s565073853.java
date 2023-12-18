import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int count = 0;

		Integer Array[] = new Integer[N];
		Arrays.sort(Array);
		for(int i = 0; i < N; i++){
			Array[i] = sc.nextInt();
		}
		for(int i = 0; i < N-2; i++){
			for(int j = i+1; j < N-1; j++){
				for(int k = j+1; k < N; k++){
					if(Array[k]<Array[i]+Array[j]){
						count++;
					}
				}
			}
		}

		System.out.println(count);

		sc.close();
	}
};