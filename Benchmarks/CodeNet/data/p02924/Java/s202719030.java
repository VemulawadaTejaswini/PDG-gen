import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mod = 0;
		for(int i = 1;i < n;i++) {
			mod = mod + i;
		}
		System.out.println(mod);
	}

}
