import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int = a, b;
		String = op;
		
		a = sc.nextInt();
		b = sc.nextInt();
		op = sc.next();
		
		while(!op.eqauls ("?")){
			if(op.equals ("+"))
				System.out.println(a + b);
			else if(op.equals ("-"))
				System.out.println(a - b);
			else if(op.eqauls ("*"))
				System.out.println(a * b);
			else if(op.equals ("/"))
				System.out.println(a / b);
			a = sc.nextInt();
			b = sc.nextInt();
			op = sc.next();
		}
	}