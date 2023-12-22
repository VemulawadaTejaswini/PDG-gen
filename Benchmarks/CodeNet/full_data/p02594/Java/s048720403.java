import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int X = sc.nextInt();//気温
		//判定
		if(X>=30) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

}
