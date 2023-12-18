import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char acceptStr = 'o';
		Scanner sc = new Scanner(System.in);
		String orderStr = sc.next();
		sc.close();
		int amount = 700;
		for(int i=0;i<orderStr.length();i++) {
			if(orderStr.charAt(i) == acceptStr) {
				amount += 100;
			}
		}
		System.out.print(amount);
	}
}