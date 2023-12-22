import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int N = sc.nextInt();
		sc.close();

		int hh = N % 10;

		if(hh == 3) {
			System.out.println("bon");
		}else if(hh == 0 || hh == 1 || hh == 6 ||hh == 8){
			System.out.println("pon");
		}else {
			System.out.println("hon");
		}
	}

}
