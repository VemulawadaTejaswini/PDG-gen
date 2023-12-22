import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s[] = new String[3];
		Scanner scan = new Scanner(System.in);		
			for ( int i = 0;; i++){
			int a = scan.nextInt;
			s[i] = scan.next();
			int b = scan.nextInt;//????????¶??\???
			String op = s[i];
			if(op == '?') {
				break;			
			} else if(op == '+') {
				System.out.println(a + b);
			} else if(op == '-') {
				System.out.println(a - b);
			} else if(op == '*') {
				System.out.println(a * b);
			} else if(op == '/') {
				System.out.println(a / b);
			}
		}
	}
}