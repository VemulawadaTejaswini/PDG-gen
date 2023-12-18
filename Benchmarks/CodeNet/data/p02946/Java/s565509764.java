import java.util.Scanner;

class Abc137b {

	public static void main(String[] args) {
		//scannerオブジェクトの生成
		Scanner sc = new Scanner(System.in);
		
		//変数の定義
		int k = sc.nextInt();
		int x = sc.nextInt();
		int min = x - k + 1;
		int max = x + k;
		
		for(int i = min; i < max ; i++){
			System.out.print(i + " " );
		}
	}
}