package saichan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner sc = new Scanner(System.in);
int S = sc.nextInt();
int W = sc.nextInt();
//コンソールに入力した数字を受け取る
if(S>W) {
	System.out.println("safe");
}else {
	System.out.println("unsafe");
}
}
}
