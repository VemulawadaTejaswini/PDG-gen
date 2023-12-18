import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	int x = sca.nextInt();

	// 処理
	int count;
	for(int j = x; ; j++) {
		count = 0;
		for(int i = 2; i <= j/2; i++) {
			if(j % i == 0) {
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println(j);
			return;
		}
	}

	// 出力

	// 後始末
	//sca.close();
	}
}