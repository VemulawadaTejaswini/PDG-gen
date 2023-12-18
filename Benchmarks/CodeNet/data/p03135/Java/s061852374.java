import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// 初期化
		Scanner sc = new Scanner(System.in);
		// Streamを使用してint配列の作成
		int[] list = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		double T = (double)list[0];
		double X = (double)list[1];

		System.out.println(String.format("%.10f", T/X));
	}

}