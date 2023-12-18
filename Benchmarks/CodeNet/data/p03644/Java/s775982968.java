import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //入力
		int targetNumber = sc.nextInt();  //ターゲットの数字
		int manyOfdividing = 0;
		while(true) {
				if(targetNumber % 2 == 0) {
					manyOfdividing++;
				}else {
					break;
				}
		}
		System.out.println(manyOfdividing);
	}
}