import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		for ( int i=0; i<n; i++ ) {
			int a = sc.nextInt();
			if ( a%2==0 ) {
				if ( a%3!=0 && a%5!=0 ) {
					System.out.println("DENIED");
					System.exit(0);
				}
			}
		}

		// 出力
		System.out.println("APPROVED");
	}
}