import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double g = scan.nextDouble();
		double ans =(g-r/2)*2;
		if(ans - (int)ans!=0) {
			System.out.println(ans);
		}else {
			System.out.println((int)ans);
		}
	}

}

