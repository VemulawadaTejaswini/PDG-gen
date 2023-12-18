import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = 0;
		for(int i = 0 ; i <= num ;i++)
			ans += i;
		System.out.println(ans);
	}

}