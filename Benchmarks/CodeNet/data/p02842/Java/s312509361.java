import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int temp = n*100;
		if (temp % 108 == 0) {
			System.out.println(temp/108);
		}
		else {
			System.out.println(":(");
		}

	}
}