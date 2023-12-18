import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String... args){
		// 入力
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// 出力
                System.out.println(IntStream.of(a, b, c).sorted().limit(2).sum());
	}
}