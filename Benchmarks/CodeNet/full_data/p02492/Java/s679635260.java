import java.util.Scanner;
class Main {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int a, b, ans;
		String op;
		
		while (true){
			a = scn.nextInt();
			op = scn.next();
			b = scn.nextInt();
			
			if (op.equals("+")){
				ans = a + b;
			}
			else if (op.equals("-")){
				ans = a - b;
			}
			else if (op.equals("*")){
				ans = a * b;
			}
			else if (op.equals("/")){
				ans = a / b;
			}
			else {
				break;
			}
			
			System.out.println(ans);
		}
		scn.close();
	}
}