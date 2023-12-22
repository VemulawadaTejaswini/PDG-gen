import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		boolean bl = true;
		float a=0,b=0;

		while(bl){
			a = stdIn.nextInt();
			b = stdIn.nextInt();

			if((1 <= a) && (a <= Math.pow(10, 9)) && (1 <= b) && (b <= Math.pow(10, 9)) ){
				break;
			}
		}

		int d = (int)a / (int)b;
		int r = (int)a % (int)b;
		float f = a / b;

		System.out.printf("%d %d %.5f", d,r,f);
	}
}