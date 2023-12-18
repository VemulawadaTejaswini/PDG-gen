import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("注文:"); String str = sc.next();
		int n = str.length();
		int price = 700;

		for(int i = 0; i < n; i++) {
			if(str.charAt(i) == 'o') {
				price += 100;
			}else {
				price += 0;
			}
		}
	System.out.println(price);

	}

}
