import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		char op = scn.next().charAt(0);
		int b = scn.nextInt();
		while(op != '?'){
			switch(op){
			case '+' :
				System.out.println(a + b); break;
			case '-' :
				System.out.println(a - b); break;
			case '*' :
				System.out.println(a * b); break;
			case '/' :
				System.out.println(a / b); break;
			}
			a = scn.nextInt();
			op = scn.next().charAt(0);
			b = scn.nextInt();
		}
	}
}