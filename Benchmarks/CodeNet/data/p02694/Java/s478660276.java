import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int X = sc.nextInt();
        
        int year = 0;
        int money = 100;
        while(money < X) {
            money = money * (double)1.1;
            money++;
        }

		// 出力
		System.out.println(year);
	}
}