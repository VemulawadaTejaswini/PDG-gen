import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int Price = 700;

		for(int i=0; i<3 ;i++ ) {
			String top = S.substring(i, i+1);
			if(top.equals("o")) {
				Price += 100;
			}
		}
		System.out.println(Price);
	}
}
