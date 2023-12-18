import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] B = new int[N+1];

		for(int i = 1 ; i <= N ; i++){
			int tmp = sc.nextInt();
			B[tmp]++;
		}
		sc.close();
		int count = 0;
		for(int i = 1 ; i <= N ; i++){
			if(B[i] != 0){
				count++;
			}
		}
		Arrays.sort(B);
/*
		for(int i = 1 ; i <= N ; i++){
			System.out.println(B[i]);
		}
*/
		int[] C = new int[count+1];

		for(int i = count ; i >= 1 ; i--){
			C[i] =B[i + (N-count)];
			//System.out.println(C[i]);
		}
		/*
		for(int i = 1 ; i <= count ; i++){
			System.out.println(C[i]);
		}
	*/

		if(count <= K){
			System.out.println("0");
		}
		else{
			int ans = 0;
			for(int i = 1 ; i <= count-K ; i++){
				ans += C[i];
			}
			System.out.println(ans);
		}



	}
}