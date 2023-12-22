package at;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int T = sc.nextInt();
		int S = sc.nextInt();
		if(D <= T*S) System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}

}
