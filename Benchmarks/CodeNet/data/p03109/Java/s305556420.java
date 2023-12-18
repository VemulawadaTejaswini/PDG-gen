import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		S = S.replace("/", "");
		int date = Integer.parseInt(S);
		
		if(date <= 20190430) {
			System.out.println("Heisei");
		} else {
			System.out.println("TBD");
		}
		
	}
}
