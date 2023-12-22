import java.util.Scanner;

class main {

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
	public void end(){
		System.exit(0);
	}
	public static void main(String[] args) {

		main n = new main();

		for(;;){

			Scanner scan = new Scanner(System.in);
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
				n.end();
				break;
			}
		}
	}
}