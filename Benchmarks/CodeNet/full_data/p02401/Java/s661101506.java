import java.util.Scanner;

class Main {

	public void plus(int x, int y){

		int ans = x + y;
		System.out.println(ans);
	}
	public void minus(int x, int y){

		int ans = x - y;
		System.out.println(ans);
	}
	public void times(int x, int y){

		int ans = x * y;
		System.out.println(ans);
	}
	public void divide(int x, int y){

		int ans = x / y;
		System.out.println(ans);
	}
	public static void main(String[] args) {

		Main n = new Main();
		Scanner scan = new Scanner(System.in);

		for(;;){

			int x = scan.nextInt();
			char ch = scan.next().charAt(0);
			int y = scan.nextInt();

			switch(ch){
			case '+':
				n.plus(x, y);
				break;
			case '-':
				n.minus(x, y);
				break;
			case '*':
				n.times(x, y);
				break;
			case '/':
				n.divide(x, y);
				break;
			default:
				scan.close();
				System.exit(0);
			}
		}
	}
}