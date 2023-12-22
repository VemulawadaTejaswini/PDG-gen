import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int k = sc.nextInt();
			
			//77:    7 * 11
			//777:   7 * 3 * 37 (111)
			//7777:  7 * 11 * 101
			//77777: 7 * 11111
			// --> 扱いが難しい...
			
			// 7 * (10^i - 1) / (10-1)
			
			//9kが 7 * (10^i - 1)の倍数
			//9k + 1 = 10^i  ---> 扱いが簡単！
			
			int d = 9*k;
			if ( k % 7 == 0 ) {
				d = d / 7;
			}
			
			int i = 1;
			int res = 0; 
			while(i < Integer.MAX_VALUE) { //ここ適当
				
				if ( res == 0 ) {
					res = 10 % d;
				}
				else {
					res = (res * 10) % d;
				}
				if ( res == 1 ) {
					//bingo!
					System.out.println(i);
					return;
				}
				
				i++;
			}
			
		}
	}

}