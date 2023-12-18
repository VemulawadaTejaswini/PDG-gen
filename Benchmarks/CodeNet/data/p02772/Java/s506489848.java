import java.util.*;
/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] A = new int[N];
		String X = "APPROVED";
		for(int i = 0 ; i<=N ; i++){
			A[i] = sc.nextInt();
			if(A[i]%2==0){
				if(A[i]%3==0){

				}else if(A[i]%5==0){

				}else{
					X = "DENIED";
				}

			}
		}
		System.out.println(X);
	}
}
