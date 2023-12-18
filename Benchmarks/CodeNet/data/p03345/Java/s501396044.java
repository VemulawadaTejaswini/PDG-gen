import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		long k = scanner.nextLong();
		long ans = k % 2 == 1 ? b - a : a-b; 
		if(Math.abs(ans) > Math.pow(10, 18)) {
			System.out.println("Unfair");
		}else {
			System.out.println(ans);
		}
		
	}

}