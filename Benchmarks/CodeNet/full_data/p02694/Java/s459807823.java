import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long x = sc.nextLong();
		int money = 100;
		int year = 0;
		// 判定
		while(money < x){
			money *= 1.01;
			year++;
		}
		System.out.print(year);
	}
}