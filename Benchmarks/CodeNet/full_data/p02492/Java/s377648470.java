import java.util.Scanner;

class Main {
	public static void main(String args[]){
	String c =null;
	while(c!="?")
	{
		Scanner scan= new Scanner(System.in);
		int a = scan.nextInt();
		c = scan.next();
		int b = scan.nextInt();
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
}