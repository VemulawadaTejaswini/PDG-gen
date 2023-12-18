import java.util.Scanner;

public class Main {



	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	int k = sca.nextInt();
	int x = sca.nextInt();


	// 処理
	if(x <= 500*k) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}


	// 後始末
	sca.close();
	}
}