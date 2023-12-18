import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long c = 0;
		for(int i = 1; i < a; i++){
			c += i;
		}
		System.out.print(c);

	}

}
