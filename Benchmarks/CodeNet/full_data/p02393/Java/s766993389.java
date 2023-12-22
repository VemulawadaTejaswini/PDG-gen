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
		int c = s.nextInt();
		if (a < b) {		
			if (b < c) {
				System.out.println(a + " " + b + " " + c);
			} else if (a < c){
				System.out.println(a + " " + c + " " + b);
			} else {
				System.out.println(c + " " + a + " " + b);
			}
		} else {
			if (c < b) {
				System.out.println(c + " " + b + " " + a);
			} else if (a < c) {
				System.out.println(b + " " + a + " " + c);
			} else {
				System.out.println(b + " " + c + " " + a);
			}
		}
	}
}