import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calc c = new Calc();
		c.abc119B();
    }
}
class Calc{
void abc119B() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double money = 0;
		for(int i=0 ; i<n ; i++) {
			double y = sc.nextDouble();
			String s = sc.next();
			switch(s) {
			case("JPY"):money += y;
                break;
			case("BTC"):money += y * 380000;
                break;
			}
		}
		System.out.println(money);
	}
}