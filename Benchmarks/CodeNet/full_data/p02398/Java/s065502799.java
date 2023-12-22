import java.util.Scanner;

class Main{

	public static void main(String[] args) {

		int a,b,c;
		int count = 0;

		Scanner stdIn = new Scanner(System.in);

		a = stdIn.nextInt();
		b = stdIn.nextInt();
		c = stdIn.nextInt();

		for(int i = a; i <= b; i++) {

			if((c % i) == 0) {
				count++;
			}
		}

		System.out.println(count);

	}

}