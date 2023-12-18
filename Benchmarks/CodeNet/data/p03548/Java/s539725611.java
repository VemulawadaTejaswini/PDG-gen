import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int haba = y;
		int ninzuu = 0;

		while(x>haba) {
			haba=haba+y+z;
			ninzuu++;
		}

		System.out.print(ninzuu);
	}

}
