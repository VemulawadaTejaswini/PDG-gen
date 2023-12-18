import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0 ; i<3;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.parallelSort(arr);
		int sum = 0;
		for(int i = 0 ;i<2;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
