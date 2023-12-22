import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();

		int makeNum = 0;
		int num = 0;

		while(makeNum < n){
			makeNum = makeNum + x;
			num = num + t;
		}

		System.out.println(num);

		sc.close();
	}
}