import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


			//Scannerクラスのインスタンスの生成
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int n = 0;

		    for (int i = a; i <= b; i++ ) {
		    	if (i % c != 0 && i % d != 0) {
		    		n++;
		    	}

		    }
		    System.out.println(n);
	}

}