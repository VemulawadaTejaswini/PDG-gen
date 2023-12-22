import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int n1 = n / 100;
		n = n -  n1 * 100;
		int n2 = n / 10;
		n = n - n2 * 10;
		if(n == 2 || n == 4 || n == 5 || n == 7 || n == 9) {
			System.out.println("hon");
		}else if(n == 0 || n == 1 || n == 6 || n == 8) {
			System.out.println("pon");
		}else {
			System.out.println("bon");
		}

	}

}