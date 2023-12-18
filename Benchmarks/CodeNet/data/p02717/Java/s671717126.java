import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		temp= c;
		c = a;
		a = temp;
		
		System.out.print(a + " " + b + " " + c);
		
	}
	
}