import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		String op=input.next();
		int b=input.nextInt();
		int calc=0;
		if(op.contentEquals("+")) {
			calc=a+b;
		}else if(op.contentEquals("-")) {
			calc=a-b;
		}
		System.out.println(calc);
	}
}