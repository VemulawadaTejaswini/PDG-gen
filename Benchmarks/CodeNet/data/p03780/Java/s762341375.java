
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		long[] array = new long[N];

		for(int i = 0;i < N;i++){
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);

		long sum = 0;
		int last_index = -1;
		for(int i = 0;i < N;i++){
			sum += array[i];
			if(K <= sum){
				last_index = i;
				break;
			}
		}

		int first_index = N;
		for(int i = 0;i < last_index;i++){
			sum -= array[i];
			if(sum < K){
				first_index = i;
				break;
			}
		}

		System.out.println(first_index);



		sc.close();
	}

}
