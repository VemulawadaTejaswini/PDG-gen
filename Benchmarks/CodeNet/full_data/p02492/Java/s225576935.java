import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a, b;
		int result = 0;
		String op;
		while(true)
		{
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();

			if(op == "?")break;
			switch(op.charAt(0)){
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '*' :
				result = a * b;
				break;
			case '/':
				result = a / b;
			case '?' :
				break;
			}
			System.out.println(result);
		}
	}

}