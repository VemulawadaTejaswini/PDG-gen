import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		double y500 =  Math.floor(X/500);
		double T = (X-y500*500);
		double y5 =  Math.floor(T/5);
		System.out.println(y500*1000+y5*5);
	}

}