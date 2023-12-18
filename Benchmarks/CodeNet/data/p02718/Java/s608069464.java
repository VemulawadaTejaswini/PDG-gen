import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inputA = new Scanner(System.in);
		Scanner inputB = new Scanner(System.in);
		int N = inputA.nextInt();
		int M = inputB.nextInt();
		Integer[] NArray = new Integer[N];
		int[] MArray = new int[M];
		
		int sum = 0;
		for(int i = 0;i < N; i++) {
			Scanner inputC = new Scanner(System.in);
			NArray[i] = inputC.nextInt();
			sum += NArray[i];
		}
		Arrays.sort(NArray, Collections.reverseOrder());
		double s = (4 * M);
		double t = 1 / s;
		double d = sum * t;
		for(int j = 0; j < M; j++) {
			MArray[j] = NArray[j];
			System.out.println(MArray[j]);
			if(MArray[j] < d) {
				System.out.println("No");
				break;
			}
			System.out.println("Yes");
		}
			
		
	}
}