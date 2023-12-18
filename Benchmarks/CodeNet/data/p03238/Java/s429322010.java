import java.util.Scanner;

public class Problem1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int age = in.nextInt();
		int a,b;
		if(age == 1) {
			System.out.println("Hello World");
		} else if(age == 2) {
			a = in.nextInt();
			b = in.nextInt();
			System.out.println(a+b);
		}
	}

}
