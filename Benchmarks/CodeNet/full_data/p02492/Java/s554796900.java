import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String args[]){
		
		while(true){
			int a = s.nextInt();
			String op = s.next();
			int b = s.nextInt();
			int ans;
		
			if (op.equals("?")) break;
			else if(op.equals("+")){
				ans=a+b; System.out.println(ans);
			}	
			else if(op.equals("-")){
				ans=a-b; System.out.println(ans);
			}
			else if(op.equals("*")){
				ans=a*b; System.out.println(ans);
			}
			else if(op.equals("/")){
				ans=a/b; System.out.println(ans);
			}
		}
	}
}