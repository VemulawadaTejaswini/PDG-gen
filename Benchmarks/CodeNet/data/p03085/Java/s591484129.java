import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String b=sc.next();

		if("A".equals(b)) {
			System.out.println("T");
		}else if ("T".equals(b)) {
			System.out.println("A");
		}else if ("C".equals(b)) {
			System.out.println("G");
		}else {
			System.out.println("C");
		}
	}
}