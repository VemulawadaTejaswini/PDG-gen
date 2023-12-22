import java.util.Scanner;

public class Main {
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			int a =scanner.nextInt();
			String op =scanner.next();
			int b =scanner.nextInt();
			
			if(op.equals("+")){
				System.out.println(a+b);
			}else if(op.equals("-")){
				System.out.println(a-b);
			}else if(op.equals("*")){
				System.out.println(a*b);
			}else if(op.equals("/")){
				System.out.println(a/b);
			}else if(op.equals("?"))break; 
		}
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.calc();

	}
}