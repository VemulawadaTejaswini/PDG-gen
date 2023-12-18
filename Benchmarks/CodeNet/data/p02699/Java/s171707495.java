

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);


		int s = sc.nextInt();
		int w = sc.nextInt();

		System.out.println(w >= s?"unsafe" : "safe");
	}

}
