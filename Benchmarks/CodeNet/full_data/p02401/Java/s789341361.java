import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String op = "";
		int b;
		int ans = 0;
		A: while(true) {
			a= sc.nextInt();
			op= sc.next();
			b= sc.nextInt();
			switch(op){
				case "+":
					ans = a + b;
					break;
				case "-":
					ans = a - b;
					break;
				case "*":
					ans = a * b;
					break;
				case "/":
					ans = a / b;
					break;
				case "?":
					break A;
			}
			System.out.println(ans);
		}
		sc.close();
	}
}

