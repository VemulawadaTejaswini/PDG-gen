import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		call(x);
		stdIn.close();
	}
	static void call(int n){
		CHECK_NUM: for (int i = 1; i <= n; i++){
			int y = i;
			if ( y % 3 == 0 ){
				System.out.print(" " + i);
				continue CHECK_NUM;
			}
			if ( y % 10 == 3 ){
				System.out.print(" " + i);
				continue CHECK_NUM;
			}
			while((y/=10) > 0) {
				if ( y % 10 == 3 ){
					System.out.print(" " + i);
					continue CHECK_NUM;
				}
			}
		}
		System.out.println();
	}
}

