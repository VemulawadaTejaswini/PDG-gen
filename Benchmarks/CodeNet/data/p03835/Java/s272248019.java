import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		//ある値の最大値
		int k = scanner.nextInt();
		// 合計値
		int s = scanner.nextInt();
		// sC2 最大値を考慮しない場合 区切り s + 2箇所
		if ( -(s - k * 3) > s ) {
			int count = (s + 2) * (s + 1) / 2;
			System.out.println(count);
		} else{
			int c = -(s - k * 3);
			int count = (c + 2) * (c + 1) / 2;
			System.out.println(count);
		}
	}
}
