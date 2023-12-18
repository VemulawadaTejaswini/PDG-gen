import java.util.Scanner;

public class Main{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);

		int a = Integer.parseInt(scanner.next());
		int b = Integer.parseInt(scanner.next());
		int c = Integer.parseInt(scanner.next());

		if ( a < b ){
			int tmp = a;
			a = b;
			b = tmp;
		}else if ( a < c ){
			int tmp = a;
			a = c;
			c = tmp;
		}
		int total = (a * 10) + b + c;
		System.out.println(total);
	}
}