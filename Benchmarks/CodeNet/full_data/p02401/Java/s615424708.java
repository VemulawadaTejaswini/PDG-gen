import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		for(;;){

			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			char ch = scan.next().charAt(0);
			if(ch == '?')
				break;
			int y = scan.nextInt();
			switch(ch){
			case '+':
				System.out.println(x + y);
				break;
			case '-':
				System.out.println(x - y);
				break;
			case '*':
				System.out.println(x * y);
				break;
			case '/':
				System.out.println(x / y);
				break;
			}
		}
	}
}