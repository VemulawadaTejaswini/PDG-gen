import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inputA = new Scanner(System.in);
		Integer N = inputA.nextInt();
		int M = inputA.nextInt();
		Integer[] NArray = new Integer[N];
		int[] MArray = new int[M];
		
		int sum = 0;
		for(int i = 0;i < N; i++) {
			
			NArray[i] = inputA.nextInt();
			sum += NArray[i];
		}
		Arrays.sort(NArray, Collections.reverseOrder());
		double s = (4 * M);
		double t = 1 / s;
		double d = sum * t;
		int aa = 0;
		for(int j = 0; j < M; j++) {
			MArray[j] = NArray[j];
			if(MArray[j] < d) {
				System.out.println("No");
				break;
			}
			aa = 100;
		}
		if(aa == 100) {
			System.out.println("Yes");
		}
	}
}