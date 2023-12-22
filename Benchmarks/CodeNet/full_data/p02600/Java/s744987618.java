import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		sc.close();

		if(N <= 599) {
			System.out.println(8);
		}else if(N <= 799) {
			System.out.println(7);
		}else if(N <= 999) {
			System.out.println(6);
		}else if(N <= 1199) {
			System.out.println(5);
		}else if(N <= 1399) {
			System.out.println(4);
		}else if(N <= 1599) {
			System.out.println(3);
		}else if(N <= 1799) {
			System.out.println(2);
		}else if(N <= 1999) {
			System.out.println(1);
		}

	}

}