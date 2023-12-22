import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("縦の長さを入力してください。");
		int a = sc.nextInt();
		System.out.println("横の長さを入れてください。");
		int b = sc.nextInt();
		System.out.println("面積は" + a*b);
		System.out.println("周の長さは" + 2*(a+b));

	}

}
