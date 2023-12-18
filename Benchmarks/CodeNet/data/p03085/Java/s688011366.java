import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String b = sc.next();

		if(b.contentEquals("A")) 	System.out.println("T");

		if(b.contentEquals("T")) 	System.out.println("A");

		if(b.contentEquals("G")) 	System.out.println("C");

		if(b.contentEquals("C")) 	System.out.println("G");

	}

}
