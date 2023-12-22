import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		while(true){
			int a = s.nextInt();
			String op = s.next();
			int b = s.nextInt();
			if(op.equals("+")){
				System.out.println((a + b));
			}
			else if(op.equals("-")){
				System.out.println((a - b));
			}
			else if(op.equals("*")){
				System.out.println(a * b);
			}
			else if(op.equals("/")){
				System.out.println(a / b);
			}
			else if(op.equals ("?")){
				break;
			}
		}
	}
	public static void main(String[] args) {
		/* 
		 * Main x;
		 * x = new Main();
		 * x.run();
		 * ??¨????????????
		 */
		new Main().run();
		
	}
}