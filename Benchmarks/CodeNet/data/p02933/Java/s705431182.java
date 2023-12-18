import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String s = scan.next();
		if(a >= 3200) {
			System.out.println(s);
		}else if(a <3200) {
			System.out.println("red");
		}
	}
}