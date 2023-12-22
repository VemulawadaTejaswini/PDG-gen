import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int array[] = new int[N];
		for(int i=0;i<N;i++) {
			int P = scan.nextInt();
			array[i] = P;
		}
		Arrays.sort(array);

		int sum = 0;
		for(int j=0;j<K;j++) {
			sum = sum + array[j];
		}
		System.out.println(sum);

	}

}
