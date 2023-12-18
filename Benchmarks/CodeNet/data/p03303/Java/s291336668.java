import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		char[] ch = scanner.next().toCharArray();
		int w = scanner.nextInt();
		for(int i = 0; i < ch.length; i+=w) {
			System.out.print(ch[i]);
		}
		System.out.println("");
	}

}