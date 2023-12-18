import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int k = scan.nextInt();
		String result = " ";

		int [] list = new int [] {a, b, c, d, e};

		for (int p = 0;p < 5; p++) {
			for (int q = 0; q < 5; q++) {
				int dis = list[q] - list[p];
				if ( dis > k ) {
					result = ":(" ;   //直接通信ができないアンテナの組が存在
				} else {
					result = "Yay!" ;   //全てのアンテナ間の距離が 15 以下
				}
			}
		}
		  System.out.println(result);
	}
}