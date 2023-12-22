import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();

		if( Character.isUpperCase( n.charAt( 0 ) ) ) {
		    System.out.println( "A" );
		}
		else {
		    System.out.println( "a" );
		}

	}
}
