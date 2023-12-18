import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double m = 0;
		if(n/2==0) {
			System.out.println(0.5000000);
		}
		else {
			m = ((n/2)+1)/n;
			System.out.println(m);
		}

	}

}
