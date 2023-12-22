import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		for(int i=0;i<9;i++){
			String name = stdIn.next();
			int am = stdIn.nextInt();
			int pm = stdIn.nextInt();
			int total = am+pm;
			int money = am*200+pm*300;
			System.out.println(name+" "+total+" "+money);
		}
	}
}