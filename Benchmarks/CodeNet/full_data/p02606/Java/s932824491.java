import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int r = scan.nextInt();
		int d = scan.nextInt();

		int ans = 0;
		int count = 0;

		for(int i = l;i<=r;i++) {
			ans = i%d;
			if(ans == 0) {
				count = count + 1;
			}
		}
		System.out.println(count);
	}

}