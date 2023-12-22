import java.util.Scanner;
public class aizu {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     int a = sc.nextInt();
	     System.out.println("a=" + a);
	     int b = sc.nextInt();
	     System.out.println("b=" + b);
	     
	     if(a < b)System.out.println("a < b");
	     else if(a > b)System.out.println("a > b");
	     else System.out.println("a == b");

	}

}