import static java.lang.System.*;

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int money;
		while((money = scan.nextInt())!=0){
			money = 1000 -money;
			int coin = 0;
			if(money >= 500){
				coin++;
				money -=500;
			}
			if(money >=100){
				while(money >=100){
					coin++;
					money -=100;
				}
			}
			if(money >=50){
				coin++;
				money -=50;
			}
			if(money >=10){
				while(money >=10){
					coin++;
					money -=10;
				}
			}
			if(money >=5){
				coin++;
				money -=5;
			}
			if(money >=1){
				while(money >=1){
					coin++;
					money -=1;
				}
			}
			out.println(coin);
		}
	}
}