import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); //お札の枚数 2*10^3
		long y = stdIn.nextLong(); //金額 2*10^7
		
		
		//boolean flag = false; //実際にその金額になるか
		
		
		for(long i = 0; i <= n; i++) {
			for(long j = 0; j <= n; j++) {
				if(i + j + (y - 10000 * i + 5000 * j)/1000 == n) {
					System.out.println(i+" "+j+" "+(n-i-j));
					return;
				}
				
				
			}
		}
		
		System.out.println(-1+" "+-1+" "+-1);
		
		
		
	}

}
