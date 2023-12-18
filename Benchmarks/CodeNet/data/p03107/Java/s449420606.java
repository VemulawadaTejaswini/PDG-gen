import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Stringをint配列に変換
		int[] S = Stream.of(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

		int zero_cnt=0;
		int one_cnt=0;
		for(int i=0;i<S.length;i++) {
			if(S[i]==0) zero_cnt++;
			else one_cnt++;
		}
		int result = Math.min(zero_cnt, one_cnt);
		System.out.println(result);
	}
}