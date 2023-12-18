import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int aaa=y+z;
		int bbb=x-z;
		int ans=0;
		ans = bbb/aaa;
		
		System.out.println(ans);
	}
}
