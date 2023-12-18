import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() { ;
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int S = sc.nextInt();

		int s1 = S/1000 ;
		int s2 = (S/100)%10 ;
		int s3 = (S/10)%10 ;
		int s4 = S%10 ;


		if(s1 == s2 || s2 == s3 || s3 == s4) {
			System.out.println("Bad");
		}else {
			System.out.println("Good");
		}


	}

}
