import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int a = sc.nextInt();
			char op = sc.next().charAt(0);
			int b = sc.nextInt();
			int ans = 0;
		if(op == '+') ans = a + b;
		if(op == '-') ans = a - b;
		if(op == '*') ans = a * b;
		if(op == '/') ans = a / b;
		if(op == '?') break;
			System.out.println(ans);
		}
	}
}