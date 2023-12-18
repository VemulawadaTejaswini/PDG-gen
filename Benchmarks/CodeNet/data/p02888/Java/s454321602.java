
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
		for(int i = 0; i < N; i++){
			Array[i] = sc.nextInt();
		}
		for(int i = 0; i < (N*(N-1)*(N-2))/6; i++){
			for(int j = i+1; j < N-1; j++){
				if(i!=j){
					for(int k = j+1; k < N; k++){
						if(Array[i]<Array[j]+Array[k] && Array[j]<Array[k]+Array[i] && Array[k]<Array[i]+Array[j]){
							if(!(j == k || k == i)){
								count++;
							}
						}
					}
				}
			}
		}

		System.out.println(count);

		sc.close();
	}
};
