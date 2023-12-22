import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		while (true){
			Scanner sc = new Scanner(System.in);

			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();

			int result = 0;

			if (op.equals("+")){
				result = a + b;
			}else if (op.equals("-")){
				result = a - b;
			}else if (op.equals("*")){
				result = a * b;
			}else if (op.equals("/")){
				result = a / b;
			}else if (op.equals("?")){
				break;
			}

			// 出力
			System.out.println(result);
		}
	}
}