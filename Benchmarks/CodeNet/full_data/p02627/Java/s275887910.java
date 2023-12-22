import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			if( Character.isUpperCase( str.charAt( 0 ) ) ) {
				System.out.println("A");
			}else {
				System.out.println("a");
			}
	}

}