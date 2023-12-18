import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() { ;
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int X = sc.nextInt();
		int A = sc.nextInt();

		if(X < A) {
			System.out.println(0);
		}else {
			System.out.println(10);
		}


	}

}
