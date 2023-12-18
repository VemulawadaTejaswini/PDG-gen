import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 2とこれで割り切れる最小
		int a = 2;
		if (n % a ==0) {
			// 割り切れたらそのまま
			System.out.println(n);
		} else {
			System.out.println(n*a);
		}
		sc.close();

	}

}