import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String op = "a";
		while(true){
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
			if(op.equals("+")){
				System.out.println(a+b);
			}else if(op.equals("-")){
				System.out.println(a-b);
			}else if(op.equals("*")){
				System.out.println(a*b);
			}else if(op.equals("/")){
				System.out.println(a/b);
			}else if(op.equals("?")){
				break;
			}
		}
	}
}