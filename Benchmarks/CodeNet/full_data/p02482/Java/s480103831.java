import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),
			b=s.nextInt();
		System.out.print("a ");
		if(a<b) System.out.print("<");
		else if(a>b) System.out.print(">");
		else System.out.print("==");
		System.out.println(" b");
	}
}