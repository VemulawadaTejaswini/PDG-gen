import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		String front = s.substring(0, (s.length()-1)/2);
		String back = s.substring((s.length()+2)/2, s.length());

		if(front.equals(back)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
