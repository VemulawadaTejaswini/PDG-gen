import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int physical = sc.nextInt();       //体力
		int type = sc.nextInt();            //技の種類
		int technique[] = new int[type];  //技の配列
		//技の値を入力し、都度体力から引く
		for(int i=0 ; i<type ; i++) {
			technique[i] = sc.nextInt();
			physical -= technique[i];
		}
		//体力が0以下か判断
		System.out.print(physical<=0 ? "Yes" : "No");
	}
}