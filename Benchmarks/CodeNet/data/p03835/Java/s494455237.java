import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final int K = sc.nextInt();
		final int S = sc.nextInt();

		int counter = 0;
		for( int i = 0; i <= K; i++){
			int sum_i = i;
			if( sum_i == S || isOver(3*K, sum_i) ){
				counter++;
				continue;
			}
			for( int j = 0; j <= K; j++){
				int sum_j = sum_i + j;
				if( sum_j == S || isOver(3*K, sum_j) ){
					counter++;
					break;
				}
				for( int k = 0; k <= K; k++){
					int sum_k = sum_j + k;
					if( sum_k == S || isOver(3*K, sum_k) ){
						counter++;
						break;
					}
					
				}
			}
		}
		System.out.println(counter);
	}
	public static boolean isOver(final int MAX, final int num){
		return MAX < num ;
	}
}