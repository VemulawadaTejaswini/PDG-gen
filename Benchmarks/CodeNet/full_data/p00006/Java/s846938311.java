import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char[] ch = new char[str.length()];

		for(int i = 0; i < str.length(); i++){
			ch[str.length() - i -1] = str.charAt(i);
		}

		for(int i = 0; i < str.length(); i++){
			System.out.print(ch[i]);
		}
	}

}