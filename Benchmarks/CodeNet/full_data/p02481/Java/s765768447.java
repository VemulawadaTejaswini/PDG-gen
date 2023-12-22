import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		int a,b;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

			b = sc.nextInt();
	System.out.println(a+" "+b);
	int area = a*b;
	int circle = a*2+b*2;
	System.out.println(area+" "+circle);
	}

}