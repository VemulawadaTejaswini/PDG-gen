import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int money = 0;
		if(2 * c < a + b) {
			int large = Math.max(x, y);
			int min = Math.min(x, y);
			money += min * 2 * c;
			int nokori = Math.abs(x-y);
			if(nokori != 0){
				if(c * 2 < (x < y ? b : a)) money += c * nokori * 2;
				else money += (x < y ? b : a) * nokori;
			}
		}else{
			money += a * x + b * y;
		}
		System.out.println(money);

	}
}