import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int sum = 0;
		
		if(N - K > 0) {
			sum += (K * X);
			sum += ((N - K) * Y);
		} else {
			sum += (N * X);
		}
		
		System.out.println(sum);
		
		scan.close();
	}

}
