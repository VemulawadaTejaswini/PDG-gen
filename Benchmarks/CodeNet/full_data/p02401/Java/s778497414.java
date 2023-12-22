import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a, b;
		String op = new String();
		while(true){
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
		
			if(a==0&&b==0&&op.equals("?")) break;
			else if(op.equals("+")){
				System.out.println(a+b);
			} else if(op.equals("-")){
				System.out.println(a-b);
			} else if(op.equals("*")){
				System.out.println(a*b);
			} else if(op.equals("/")){
				System.out.println(a/b);
			}
		}
	}
}