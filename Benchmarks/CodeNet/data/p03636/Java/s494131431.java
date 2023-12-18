import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int tyuo=s.length()-2;
		System.out.print(s.charAt(0));
		System.out.print(tyuo);
		System.out.println(s.charAt(s.length()-1));
	}

}
