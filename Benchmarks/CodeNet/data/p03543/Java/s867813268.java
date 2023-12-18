import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		if(n.charAt(1)==n.charAt(2)) {
			if(n.charAt(0)==n.charAt(1) || n.charAt(1)==n.charAt(3)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("No");
		}
	}

}
