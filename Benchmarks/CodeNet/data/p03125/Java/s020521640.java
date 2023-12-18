import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		if(b%a==0) {
			System.out.println(a+b);
		}else {
			System.out.println(b-a);
		}


	}

}
