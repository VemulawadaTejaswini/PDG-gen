import java.util.Scanner;
/*
 * 1 2 3 5 6 8 9 10 13 14 17 19 23
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// N = ドル
		//for(int i = 1; i <= 100; i++) {
		int N = sc.nextInt();
		// TODO test
		//int N = i;
		boolean ans = false;
		if(N <= 3 || N == 5 || N == 6 || N == 9 || N == 10) {

		}else if(N % 7 == 0) {
			ans = true;
		}else if(N % 4 == 0) {
			ans = true;
		}else if(N % 7 % 4 == 0) {
			ans = true;
		}else if((N % 4 + 4) % 7 == 0) {
			ans = true;
		}
		//System.out.print(N +":");
		System.out.println(ans? "Yes":"No");
		sc.close();

		//}
	}

}
