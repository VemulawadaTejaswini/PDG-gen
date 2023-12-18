import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a < 1000) {
			System.out.println("ABC"+a);
		}else {
			System.out.println("ABD"+ a %1000 + 1);
		}
	}

}