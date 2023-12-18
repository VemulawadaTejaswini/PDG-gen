import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = 0;
		if(a>b) {
			c = a;
		}else if(a<b) {
			c = b;
		}else {
			System.out.println(a+a);
			System.exit(0);
		}
		
		System.out.println(c+(c-1));
		
		
	}

}
