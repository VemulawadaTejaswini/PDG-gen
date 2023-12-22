import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		while(true){		
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			
			if(op.equals("?")) break;
			
			if(op.equals("+")) System.out.println(a+b);
			else if(op.equals("-")) System.out.println(a-b);
			else if(op.equals("*")) System.out.println(a*b);
			else if(op.equals("/")) System.out.println(a/b);
			
			System.out.println("");
		}
	}
}