import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt(),count=1;
		long sum = 0;
		Integer[] array = new Integer[3*N];

		for(int i=0;i<3*N;i++) {
			array[i] = sc.nextInt();
		}

		Arrays.sort(array, Collections.reverseOrder());
		for(int i=0;i<N;i++) {
			sum+=array[count];
			System.out.println(array[count]);
			count+=2;
		}

		System.out.println(sum);
	}
}