import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for(;;){
			int n = scan.nextInt();
			int x = scan.nextInt();

			if(n == 0 && x == 0)
				break;

			int d = x / 3 * 2;

			int p = (int)Math.ceil((d - 1) / 2);

			for(int i=1; n<p; i++){
				if(i + n != d)
					p--;
			}
			System.out.println(p);

		}

	}

}