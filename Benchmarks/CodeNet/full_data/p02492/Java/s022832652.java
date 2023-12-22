import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int end = 0;
		while (end == 0) {
			int a = sc.nextInt();
			String c = sc.next();
			int b = sc.nextInt();
			int answer;
			
			switch(c){
			case "+":
				answer = a+b;
				System.out.println(answer);
				break;
			case "-":
				answer = a-b;
				System.out.println(answer);
				break;
			case "*":
				answer = a*b;
				System.out.println(answer);
				break;
			case "/":
				answer = a/b;
				System.out.println(answer);
				break;
			case "?":
				end = 1;
				break;
			}
		}
	}
}