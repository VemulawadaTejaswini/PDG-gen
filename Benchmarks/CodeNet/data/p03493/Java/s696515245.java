import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		s = s.replaceAll("0", "");
		System.out.println(s.length());
	}

}
