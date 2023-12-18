
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N =0;
		int sum =0;
		N = scan.nextInt();

		int[] array = new int[N];
		for(int i=0; i<N; i++) {
			array[i] = scan.nextInt();
		}

		Arrays.sort(array);
		for(int i = 0;i<N-1;i++) {
			sum += array[i];
		}
		if(array[N-1]<sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
