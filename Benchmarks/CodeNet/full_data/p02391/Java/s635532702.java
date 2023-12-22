import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scan s = new Scan();
		s.getNum();
	}
}

class Scan {
	public static void getNum() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		String judge = "==";
		if (a > b) {		
 			judge = ">";
 		} else if (a < b) {
 			judge = "<";
		}
		System.out.println(a + judge + b);
	}
}