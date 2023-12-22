import java.util.Scanner;

class Main {

	private int ans;
	public Main(){
		ans = 0;
	}
	public void plus(int x, int y){

		ans = x + y;
		System.out.println(ans);
	}
	public void minus(int x, int y){

		ans = x - y;
		System.out.println(ans);
	}
	public void times(int x, int y){

		ans = x * y;
		System.out.println(ans);
	}
	public void divide(int x, int y){

		ans = x / y;
		System.out.println(ans);
	}
	public static void main(String[] args){

		Main n = new Main();

		for(;;){

			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			String str = scan.next();
			int y = scan.nextInt();

			if(str == "+"){
				n.plus(x, y);
			}else if(str == "-"){
				n.minus(x, y);
			}else if(str == "*"){
				n.times(x, y);
			}else if(str == "/"){
				n.divide(x, y);
			}else{
				scan.close();
			}
		}
	}
}