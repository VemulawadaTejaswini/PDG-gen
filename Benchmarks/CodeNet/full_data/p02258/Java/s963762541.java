import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();	//要素数
		
		gcd_profits(num, scanner);
		
		scanner.close();
	}
	
	public static void gcd_profits(int num , Scanner scanner) {
		int sub;
		int min;
		int count = 0;
		int profits = 0;
		int cur;

		min = (int)Math.pow(10, 9);
		
		  while (count < num) {
		  	cur = scanner.nextInt();	//価格
		  	
		  	if( cur < min ) {
		  		min = cur;
		  	}
		  	
		  	//差分を出していく
		  	sub = cur - min;
		  	
		  	//最小か最大か調べる
		  	if( sub > profits ){
		  		profits = sub;
		  	}
		  	
		  	count ++;
		  }
		  System.out.println(profits);
		}
}


