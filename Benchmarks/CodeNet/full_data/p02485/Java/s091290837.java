
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int x = sc.nextInt();
			int y = 0;

			if (x==0) {
				break;
			}

			for(int i = 1000; i > 0; i--){

				if((int)Math.pow(10, i - 1) <= x && x < (int)Math.pow(10, i)){
					int a = x / (int)Math.pow(10, i - 1);
					int b =	x % (int)Math.pow(10, i - 1);
					y = y + a;
					x = b;
				}
			}

			System.out.printf("%d\n",y);
		}
	}
}