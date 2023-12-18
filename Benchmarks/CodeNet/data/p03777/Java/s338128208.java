import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		if((a=="H" && b=="H")||(a=="D" && b=="D"))System.out.println("H");
		else System.out.println("D");
		
	}

}
