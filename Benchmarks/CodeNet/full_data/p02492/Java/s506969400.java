import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while( true ){
			String temp;
			int a = 0, b = 0;
			int ans = 0;
			String op;
			try{
				temp = scan.next();
				a = Integer.parseInt(temp);
				temp = scan.next();
				op = temp;
				temp = scan.next();
				b = Integer.parseInt(temp);
				if( op.equals("+") ){
					ans = a + b;
				}else if( op.equals("-") ){
					ans = a - b;
				}else if( op.equals("*") ){
					ans = a * b;
				}else if( op.equals("/") ){
					ans = a / b;
				}else if( op.equals("?") ){
					return;
				}else{
					continue;
				}
				System.out.println(ans);
			}catch( IllegalStateException e ){
				System.out.println(e);
			}
		}
		return;
	}
}