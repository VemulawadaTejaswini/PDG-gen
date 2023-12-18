import java.util.Scanner;

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
		}else if(N % 8 % 7 == 0 || N % 14 % 4 == 0) {
			ans = true;
		}else if(N % 12 % 7 == 0 || N % 21 % 4 == 0) {
			ans = true;
		}else if(N % 16 % 7 == 0 || N % 20 % 7 == 0 || N % 24 % 7 == 0) {
			ans = true;
		}

		//System.out.print(N +":");
		System.out.println(ans? "Yes":"No");
		sc.close();

		//}
	}

}
