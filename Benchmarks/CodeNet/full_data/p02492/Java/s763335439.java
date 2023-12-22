import java.util.Scanner;

class Main {
	public static void main(String args[]){

		Scanner scan= new Scanner(System.in);
		int a = scan.nextInt();
		String c = scan.next();
		int b = scan.nextInt();
		System.out.println(c);
		switch(c)
		{
		case "+":
			System.out.println(a+b);
		break;
		case "-":
			System.out.println(a-b);
		break;
		case "/":
			System.out.println(a/b);
		break;
		case "*":
			System.out.println(a*b);
		break;
		case "?":
		break;
		}
	}
}