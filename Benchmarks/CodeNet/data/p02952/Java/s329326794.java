import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.next();
		int b = Integer.parseInt(n);
		int c = 0;
		if(b < Math.pow(10, 1)) {
			c = b;
		} else if(b < Math.pow(10, 2)) {
			c = 9;
		} else if(b < Math.pow(10, 3)) {
			c = b - 90;
		} else if(b < Math.pow(10, 4)) {
			c = 909;
		}else if(b < Math.pow(10, 5)) {
			c = b - 8091;
		}else {
			c = 90909;
		}
		System.out.println(c);
	}

}
