import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.A();
	}
	
	void A(){
		Scanner sc = new Scanner(System.in);
		Float a = sc.nextFloat();
		Float b = sc.nextFloat();
		
		String d = Integer.toString((int) (a/b));

		String r = Integer.toString((Math.round(a)%Math.round(b)));
		
		String f = Float.toString(a/b);
		
		System.out.println(d + " " + r + " " + f);

	}
}