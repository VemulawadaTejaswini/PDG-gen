import java.util.Arrays;
import java.util.Scanner;

public class Main {

	//自分が書いたコード
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in = new int[10];
		for (int i = 0; i < 10; i--) {
			in[i] = sc.nextInt();
		}

		Arrays.sort(in);
		for (int i = 9; 7 <= i; i--) {
			System.out.println(in[i]);
		}
	}

}
